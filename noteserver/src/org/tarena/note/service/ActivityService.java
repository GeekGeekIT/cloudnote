package org.tarena.note.service;

import javax.servlet.http.HttpServletRequest;

import org.tarena.note.entity.NoteResponse;

public interface ActivityService {
	/**
	 * 显示所有活动
	 * @param request	
	 * @return		 
	 */
	public NoteResponse listAllActivity (HttpServletRequest request);
	/**
	 * 显示当前活动下所有的参赛笔记
	 * @param activityId	传入当前活动的activityId
	 * @return	
	 */
	public NoteResponse findByActivityId(String activityId);
	/**
	 * 投稿
	 * @param activityId
	 * @param noteId
	 * @return
	 */
	public NoteResponse activity_note (String activityId, String noteId);
	/**
	 * 踩/赞
	 */
	public NoteResponse upOrDownNote(String noteId,int flag);
}
