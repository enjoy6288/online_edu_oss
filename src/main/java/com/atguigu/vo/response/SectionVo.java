package com.atguigu.vo.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class SectionVo {
    @ApiModelProperty(value = "章节ID")
    private String id;
    @ApiModelProperty(value = "章节名称")
    private String title;
    @ApiModelProperty(value = "视频资源")
    private String videoSourceId;
}
