package com.hw.project1.entity;

import java.util.List;

public class PagedResponse<T> {
    private List<T> content;
    private int pageIndex;
    private int pageSize;
    private long totalRow;
    private int totalPage;

    public PagedResponse(List<T> content, int pageIndex, int pageSize, long totalRow, int totalPage) {
        this.content = content;
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.totalRow = totalRow;
        this.totalPage = totalPage;
    }
}