package com.github.attemper.common.param.sys.tag;

import com.github.attemper.common.param.CommonParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.StringUtils;

import java.util.List;

/**
 * @author ldang
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TagResourceUpdateParam implements CommonParam {

    protected String tagName;

    protected List<String> resourceNames;

    public String validate() {
        if(StringUtils.isBlank(tagName)) {
            return "5300";
        }
        return null;
    }

}
