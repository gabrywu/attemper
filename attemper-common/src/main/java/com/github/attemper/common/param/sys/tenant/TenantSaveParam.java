package com.github.attemper.common.param.sys.tenant;

import com.github.attemper.common.constant.CommonConstants;
import com.github.attemper.common.enums.TenantStatus;
import com.github.attemper.common.param.CommonParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.StringUtils;

import java.util.regex.Pattern;

/**
 * @author ldang
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TenantSaveParam implements CommonParam {

    private static Pattern emailPattern;

    protected String userName;

    protected String displayName;

    protected String password;

    protected String email;

    protected String mobile;

    protected Integer status;

    public String validate() {
        if (StringUtils.isBlank(userName)) {
            return "5100";
        }
        if (StringUtils.isBlank(displayName)) {
            return "5103";
        }
        if (StringUtils.isNotBlank(email)) {
            if (emailPattern == null) {
                emailPattern = Pattern.compile(CommonConstants.REGEX_EMAIL);
            }
            for (String emailStr : email.split(",")) {
                if (!emailPattern.matcher(emailStr).find()) {
                    return "5118";
                }
            }
        }
        if (TenantStatus.get(status) == null) {
            return "5121";
        }
        return null;
    }
}
