package org.andy.pay.alipay.request;

import java.util.List;

/**
 * version: 1.0
 * description: 预付款金额信息
 * author:andy
 * date: 2017/01/11
 */
public class TradePrecreateRequest extends BaseRequest{

    /**
     * 异步通知url(非必须)
     */
    private String notify_url;

    /**
     * 必须(商户订单号,64个字符以内、只能包含字母、数字、下划线；需保证在商户端不重复)
     */
    private String out_trade_no;

    /**
     *(可选)卖家支付宝用户ID。 如果该值为空，则默认为商户签约账号对应的支付宝用户ID
     */
    private String seller_id;

    /**
     * (必须)订单总金额
     */
    private double total_amount;

    /**
     * (可选)可打折金额.
     */
    private double discountable_amount;

    /**
     * (可选)不可打折金额
     */
    private double undiscountable_amount;

    /**
     * (可选)买家支付宝账号
     */
    private double buyer_logon_id;

    /**
     * (必须)订单标题
     */
    private String subject;

    /**
     * (可选)对交易或商品的描述
     */
    private String body;

    /**
     * (可选)订单包含的商品列表信息.Json格式. 其它说明详见
     */
    private List<GoodsDetail> goods_detail;

    /**
     * (可选)商户操作员编号
     */
    private String operator_id;

    /**
     * (可选)商户门店编号
     */
    private String store_id;

    /**
     * (可选)商户机具终端编号
     */
    private String terminal_id;

    /**
     * (可选)业务扩展参数
     */
    private ExtendParams extend_params;

    /**
     * (可选)该笔订单允许的最晚付款时间，逾期将关闭交易
     */
    private String timeout_express;

    /**
     * (可选)  描述分账信息，json格式
     */
    private RoyaltyInfo royalty_info;

    /**
     * (可选)二级商户信息,当前只对特殊银行机构特定场景下使用此字段
     */
    private SubMerchant sub_merchant;

    /**
     * (可选)支付宝店铺的门店ID
     */
    private String alipay_store_id;

    public TradePrecreateRequest() {
    }

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id;
    }

    public double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }

    public double getDiscountable_amount() {
        return discountable_amount;
    }

    public void setDiscountable_amount(double discountable_amount) {
        this.discountable_amount = discountable_amount;
    }

    public double getUndiscountable_amount() {
        return undiscountable_amount;
    }

    public void setUndiscountable_amount(double undiscountable_amount) {
        this.undiscountable_amount = undiscountable_amount;
    }

    public double getBuyer_logon_id() {
        return buyer_logon_id;
    }

    public void setBuyer_logon_id(double buyer_logon_id) {
        this.buyer_logon_id = buyer_logon_id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<GoodsDetail> getGoods_detail() {
        return goods_detail;
    }

    public void setGoods_detail(List<GoodsDetail> goods_detail) {
        this.goods_detail = goods_detail;
    }

    public String getOperator_id() {
        return operator_id;
    }

    public void setOperator_id(String operator_id) {
        this.operator_id = operator_id;
    }

    public String getStore_id() {
        return store_id;
    }

    public void setStore_id(String store_id) {
        this.store_id = store_id;
    }

    public String getTerminal_id() {
        return terminal_id;
    }

    public void setTerminal_id(String terminal_id) {
        this.terminal_id = terminal_id;
    }

    public ExtendParams getExtend_params() {
        return extend_params;
    }

    public void setExtend_params(ExtendParams extend_params) {
        this.extend_params = extend_params;
    }

    public String getTimeout_express() {
        return timeout_express;
    }

    public void setTimeout_express(String timeout_express) {
        this.timeout_express = timeout_express;
    }

    public RoyaltyInfo getRoyalty_info() {
        return royalty_info;
    }

    public void setRoyalty_info(RoyaltyInfo royalty_info) {
        this.royalty_info = royalty_info;
    }

    public SubMerchant getSub_merchant() {
        return sub_merchant;
    }

    public void setSub_merchant(SubMerchant sub_merchant) {
        this.sub_merchant = sub_merchant;
    }

    public String getAlipay_store_id() {
        return alipay_store_id;
    }

    public void setAlipay_store_id(String alipay_store_id) {
        this.alipay_store_id = alipay_store_id;
    }
}
