package ai.test.domain;


public class AiDto {

    private int bookId;
    private String bookNm;
    private String bookCont;
    private String bookPubls;
    private String delYn;
    private String crtDt;

    private String crtDtTxt;

    public AiDto(int bookId, String bookNm, String bookCont, String bookPubls, String delYn, String crtDt) {
        this.bookId = bookId;
        this.bookNm = bookNm;
        this.bookCont = bookCont;
        this.bookPubls = bookPubls;
        this.delYn = delYn;
        this.crtDt = crtDt;
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
}
