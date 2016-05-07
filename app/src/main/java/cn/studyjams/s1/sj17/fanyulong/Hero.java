package cn.studyjams.s1.sj17.fanyulong;

/**
 * 定义一个实体类，作为ListView适配器的适配类型
 */
public class Hero {
    private String name;
    private int imgId;
    private String introduce;

    public Hero(String name,int imgId,String introduce){
        this.name = name;
        this.imgId = imgId;
        this.introduce = introduce;
    }
    public String getName(){
        return name;
    }
    public int getImgId(){
        return imgId;
    }
    public String getIntroduce(){
        return introduce;
    }
}
