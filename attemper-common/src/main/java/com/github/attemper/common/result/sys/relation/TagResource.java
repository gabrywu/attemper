package com.github.attemper.common.result.sys.relation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 标签与资源的关系
 * @author ldang
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TagResource {

	protected String tagName;

	protected String resourceName;

	protected String tenantId;
}