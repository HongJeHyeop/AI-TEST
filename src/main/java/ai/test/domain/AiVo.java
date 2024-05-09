package ai.test.domain;

import java.util.List;

public class AiVo {
    private int bookId;
    private String bookNm;
    private String bookCont;
    private String bookPubls;

    private float[] embedding;
    private String delYn;
    private String crtDt;
    private String crtDtTxt;

    public int getBookId() {
        return bookId;
    }

    public String getBookNm() {
        return bookNm;
    }

    public String getBookCont() {
        return bookCont;
    }

    public String getBookPubls() {
        return bookPubls;
    }

    public float[] getEmbedding() {
        return embedding;
    }

    public String getDelYn() {
        return delYn;
    }

    public String getCrtDt() {
        return crtDt;
    }

    public String getCrtDtTxt() {
        return crtDtTxt;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookNm(String bookNm) {
        this.bookNm = bookNm;
    }

    public void setBookCont(String bookCont) {
        this.bookCont = bookCont;
    }

    public void setBookPubls(String bookPubls) {
        this.bookPubls = bookPubls;
    }

    public void setEmbedding(float[] embedding) {
        this.embedding = embedding;
    }

    public void setDelYn(String delYn) {
        this.delYn = delYn;
    }

    public void setCrtDt(String crtDt) {
        this.crtDt = crtDt;
    }

    public void setCrtDtTxt(String crtDtTxt) {
        this.crtDtTxt = crtDtTxt;
    }

    @Override
    public String toString() {
        return "AiVo{" +
                "bookId=" + bookId +
                ", bookNm='" + bookNm + '\'' +
                ", bookCont='" + bookCont + '\'' +
                ", bookPubls='" + bookPubls + '\'' +
                ", delYn='" + delYn + '\'' +
                ", crtDt='" + crtDt + '\'' +
                ", crtDtTxt='" + crtDtTxt + '\'' +
                '}';
    }
}
