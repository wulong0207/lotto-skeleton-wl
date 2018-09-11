package com.hhly.skeleton.lotto.base.operate.bo;



/**
 * @desc 文章类
 * @author lidecheng
 * @date 2017年3月14日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OperateArticleLottBO extends OperateArticleBaseBO{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5012743844398331241L;
	/**封面图片*/
  private String articleImg;
	/**封面图片显示:0不显示;1显示*/
  private Byte articleImgDisplay;
	/**摘要*/
  private String articleSummary;	
  /**查询详细信息*/
  private String articleContent;
  /**点击数*/
  private Integer click;
  /**是否视频，1是，0否*/
  private Short isVideo;
  /**是否置顶，1是，0否*/
  private Short isTop;
  /**父节点*/
  private Integer parent;
 
	public Integer getParent() {
	return parent;
}
public void setParent(Integer parent) {
	this.parent = parent;
}
	public Short getIsTop() {
	return isTop;
}
public void setIsTop(Short isTop) {
	this.isTop = isTop;
}
	public Short getIsVideo() {
	return isVideo;
}
public void setIsVideo(Short isVideo) {
	this.isVideo = isVideo;
}
	public String getArticleImg() {
		return articleImg;
	}
	public void setArticleImg(String articleImg) {
		this.articleImg = articleImg;
	}
	public Byte getArticleImgDisplay() {
		return articleImgDisplay;
	}
	public void setArticleImgDisplay(Byte articleImgDisplay) {
		this.articleImgDisplay = articleImgDisplay;
	}
	public String getArticleSummary() {
		return articleSummary;
	}
	public void setArticleSummary(String articleSummary) {
		this.articleSummary = articleSummary;
	}	
	public String getArticleContent() {
		return articleContent;
	}
	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}
	public Integer getClick() {
		return click;
	}
	public void setClick(Integer click) {
		this.click = click;
	}	
	
}