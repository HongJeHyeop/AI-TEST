package ai.test.domain;


public class AiDto {

    private int bookId;
    private String bookNm;
    private String bookCont;
    private String bookPubls;
    private String delYn;
    private String crtDt;

    private String crtDtTxt;

    public AiDto( String bookNm, String bookCont, String bookPubls) {
        this.bookNm = bookNm;
        this.bookCont = bookCont;
        this.bookPubls = bookPubls;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookNm() {
        return bookNm;
    }

    public void setBookNm(String bookNm) {
        this.bookNm = bookNm;
    }

    public String getBookCont() {
        return bookCont;
    }

    public void setBookCont(String bookCont) {
        this.bookCont = bookCont;
    }

    public String getBookPubls() {
        return bookPubls;
    }

    public void setBookPubls(String bookPubls) {
        this.bookPubls = bookPubls;
    }

    public String getDelYn() {
        return delYn;
    }

    public void setDelYn(String delYn) {
        this.delYn = delYn;
    }

    public String getCrtDt() {
        return crtDt;
    }

    public void setCrtDt(String crtDt) {
        this.crtDt = crtDt;
    }

    public String getCrtDtTxt() {
        return crtDtTxt;
    }

    public void setCrtDtTxt(String crtDtTxt) {
        this.crtDtTxt = crtDtTxt;
    }

    @Override
    public String toString() {
        return "AiDto{" +
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
