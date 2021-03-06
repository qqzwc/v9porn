package com.u9porn.ui.porn9video.play;

import com.u9porn.data.db.entity.V9PornItem;
import com.u9porn.data.model.VideoComment;
import com.u9porn.ui.BaseView;

import java.util.List;

/**
 * @author flymegoc
 * @date 2017/11/15
 * @describe
 */

public interface PlayVideoView extends BaseView {
    void showParsingDialog();

    void playVideo(V9PornItem v9PornItem);

    void errorParseVideoUrl(String errorMessage);

    void favoriteSuccess();

    void setVideoCommentData(List<VideoComment> videoCommentList,boolean pullToRefresh);

    void setMoreVideoCommentData(List<VideoComment> videoCommentList);

    void noMoreVideoCommentData(String message);

    void loadMoreVideoCommentError(String message);

    void loadVideoCommentError(String message);

    void commentVideoSuccess(String message);

    void commentVideoError(String message);

    void replyVideoCommentSuccess(String message);

    void replyVideoCommentError(String message);
}
