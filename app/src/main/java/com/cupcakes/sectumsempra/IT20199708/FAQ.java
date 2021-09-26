package com.cupcakes.sectumsempra.IT20199708;

public class FAQ {

    String faqId;
    String que;
    String ans;

    public FAQ() {

    }

    public FAQ(String faqId, String que, String ans) {
        this.faqId = faqId;
        this.que = que;
        this.ans = ans;
    }

    public String getFaqId() {
        return faqId;
    }

    public String getQue() {
        return que;
    }

    public String getAns() {
        return ans;
    }
}
