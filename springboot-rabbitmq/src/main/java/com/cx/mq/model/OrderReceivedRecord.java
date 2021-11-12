package com.cx.mq.model;
import java.math.BigDecimal;
import java.util.Date;
/**
 * 收货记录
 * @author chenxin
 * @date 2021/11/12
 */
public class OrderReceivedRecord {
    private Long id;
    /**
     * 亚马逊订单号
     */
    private String amazonOrderNo;
    /**
     * actualCtns货物数量
     */
    private Integer actualCtns;
    /**
     * actualGw 货物重量
     */
    private BigDecimal actualGw;
    /**
     * actualCbm货物体积
     */
    private BigDecimal actualCbm;
    /**
     * actualCw计价重量
     */
    private BigDecimal actualCw;
    /**
     * createTime创建时间
     */
    private Date createTime;
    /**
     * mawbNomawb_no
     */
    private String mawbNo;
    private Date etd;
    private Date atd;
    private Date eta;
    private Date ata;
    private Date dateRemarkOne;
    private Date dateRemarkTwo;
    private Date dateRemarkThree;
    private Date dateRemarkFour;
    private String textRemarkOne;
    private String textRemarkTwo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAmazonOrderNo() {
        return amazonOrderNo;
    }

    public void setAmazonOrderNo(String amazonOrderNo) {
        this.amazonOrderNo = amazonOrderNo;
    }

    public Integer getActualCtns() {
        return actualCtns;
    }

    public void setActualCtns(Integer actualCtns) {
        this.actualCtns = actualCtns;
    }

    public BigDecimal getActualGw() {
        return actualGw;
    }

    public void setActualGw(BigDecimal actualGw) {
        this.actualGw = actualGw;
    }

    public BigDecimal getActualCbm() {
        return actualCbm;
    }

    public void setActualCbm(BigDecimal actualCbm) {
        this.actualCbm = actualCbm;
    }

    public BigDecimal getActualCw() {
        return actualCw;
    }

    public void setActualCw(BigDecimal actualCw) {
        this.actualCw = actualCw;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getMawbNo() {
        return mawbNo;
    }

    public void setMawbNo(String mawbNo) {
        this.mawbNo = mawbNo;
    }

    public Date getEtd() {
        return etd;
    }

    public void setEtd(Date etd) {
        this.etd = etd;
    }

    public Date getAtd() {
        return atd;
    }

    public void setAtd(Date atd) {
        this.atd = atd;
    }

    public Date getEta() {
        return eta;
    }

    public void setEta(Date eta) {
        this.eta = eta;
    }

    public Date getAta() {
        return ata;
    }

    public void setAta(Date ata) {
        this.ata = ata;
    }

    public Date getDateRemarkOne() {
        return dateRemarkOne;
    }

    public void setDateRemarkOne(Date dateRemarkOne) {
        this.dateRemarkOne = dateRemarkOne;
    }

    public Date getDateRemarkTwo() {
        return dateRemarkTwo;
    }

    public void setDateRemarkTwo(Date dateRemarkTwo) {
        this.dateRemarkTwo = dateRemarkTwo;
    }

    public Date getDateRemarkThree() {
        return dateRemarkThree;
    }

    public void setDateRemarkThree(Date dateRemarkThree) {
        this.dateRemarkThree = dateRemarkThree;
    }

    public Date getDateRemarkFour() {
        return dateRemarkFour;
    }

    public void setDateRemarkFour(Date dateRemarkFour) {
        this.dateRemarkFour = dateRemarkFour;
    }

    public String getTextRemarkOne() {
        return textRemarkOne;
    }

    public void setTextRemarkOne(String textRemarkOne) {
        this.textRemarkOne = textRemarkOne;
    }

    public String getTextRemarkTwo() {
        return textRemarkTwo;
    }

    public void setTextRemarkTwo(String textRemarkTwo) {
        this.textRemarkTwo = textRemarkTwo;
    }

    @Override
    public String toString() {
        return "OrderReceivedRecord{" +
                "id=" + id +
                ", amazonOrderNo='" + amazonOrderNo + '\'' +
                ", actualCtns=" + actualCtns +
                ", actualGw=" + actualGw +
                ", actualCbm=" + actualCbm +
                ", actualCw=" + actualCw +
                ", createTime=" + createTime +
                ", mawbNo='" + mawbNo + '\'' +
                ", etd=" + etd +
                ", atd=" + atd +
                ", eta=" + eta +
                ", ata=" + ata +
                ", dateRemarkOne=" + dateRemarkOne +
                ", dateRemarkTwo=" + dateRemarkTwo +
                ", dateRemarkThree=" + dateRemarkThree +
                ", dateRemarkFour=" + dateRemarkFour +
                ", textRemarkOne='" + textRemarkOne + '\'' +
                ", textRemarkTwo='" + textRemarkTwo + '\'' +
                '}';
    }
}