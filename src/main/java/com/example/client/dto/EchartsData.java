package com.example.client.dto;

import java.util.List;
import lombok.Data;

/**
 * @author zhangqingchun
 * @date 2020/11/13
 * @description
 */
@Data
public class EchartsData {

    private List<String> xAxisData;

    private List<Integer> seriesData;
}
