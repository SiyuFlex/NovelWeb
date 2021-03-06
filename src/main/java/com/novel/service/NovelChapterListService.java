package com.novel.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.novel.pojo.NovelChapterList;

public interface NovelChapterListService {

	public List<NovelChapterList> selectNovelChapterList(NovelChapterList chapterList);

	public String crawlerNovelChapter(NovelChapterList chapterList);

	public void updateFilePath(NovelChapterList novelChapterList);
	
	public String selectChapter(HttpServletRequest request, NovelChapterList novelChapterList);

	public void updateChapterListJsonFile(HttpServletRequest request, NovelChapterList novelChapterList);
}
