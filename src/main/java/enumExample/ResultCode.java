package enumExample;

/**
 * TODO: 类描述
 *
 * @author h.l
 * @date Created in 2019/9/17 15:09
 */
public enum ResultCode {
    REQ_ERR(1001,"请求失败"),
    CS_YC(1002,"参数异常");

    private Integer key;
    private String desc;

    private ResultCode(Integer key,String desc){
        this.key=key;
        this.desc=desc;
    }

    public Integer getKey(){
        return key;
    }
    public String getDesc(){
        return desc;
    }

    @Override
    public String toString() {
        return "ResultCode{" +
                "key=" + key +
                ", desc='" + desc + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ResultCode ss =   ResultCode.valueOf(ResultCode.class,"REQ_ERR");
        System.out.println(ss);
        for (ResultCode day:ResultCode.values()) {
            System.out.println("name:"+day.name()+
                    ",fieldName:"+day.getKey()+",fieldDesc:"+day.getDesc());


        }

    }
}
