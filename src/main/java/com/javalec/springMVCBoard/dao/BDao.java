package com.javalec.springMVCBoard.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.javalec.springMVCBoard.dto.BDto;

public interface BDao {

	//投稿登録
	public void write(@Param("bName") String bName, @Param("bTitle") String bTitle, @Param("bContent") String bContent);

	// 投稿すべて取得
	public ArrayList<BDto> list();

	// 投稿1件取得
	public BDto contentView(@Param("bId") String bId);

	// 投稿編集
	public void modify(@Param("bId") String bId, @Param("bName") String bName, @Param("bTitle") String bTitle, @Param("bContent") String bContent);

	// 投稿削除
	public void delete(@Param("bId") String bId);

	// コメント1件取得
	public BDto reply_view(@Param("bId") String bId);

	// コメント登録
	public void reply(@Param("bId") String bId, @Param("bName") String bName, @Param("bTitle") String bTitle, @Param("bContent") String bContent, @Param("bGroup") String bGroup, @Param("bStep") String bStep, @Param("bIndent") String bIndent);

	// コメントの同じグループ(親投稿ID)そして登録投稿より大きい階層値を1増加する
	public void replyShape(@Param("bGroup") String bGroup, @Param("bStep") String bStep);

	// 投稿ページビュー数増加
	public void upHit(final @Param("bId") String bId);

}
