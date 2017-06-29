package com.company.Entity;

/**
 * Created by Administrator on 2017/6/29.
 */
public class Nurse {
    private String nurseName; //姓名
    private int NurseId; //id
    private String nurseSex; //性别
    private int nurseAge;  //年龄
    private int nurseWorkAge; //护龄
    private String nurseArea; //地区
    private int nurseEvaluate; //评分
    private int nursePrice; //个人价格
    private String[] nurseProtectArea; //护理范围
    private int nurseHeigt; //身高
    private int nurseWeight; //体重
    private String nurseBloodType; //血型
    private String nurseNation;  //民族
    private String nurseIdentity; //身份证号码
    private String nurseConstellation; //星座
    private String nurseAnimal; //生肖
    private String nurseDescription; //个人介绍


    public Nurse(String nurseName, int nurseId, String nurseSex, int nurseAge, int nurseWorkAge, String nurseArea, int nurseEvaluate, int nursePrice, String[] nurseProtectArea, int nurseHeigt, int nurseWeight, String nurseBloodType, String nurseNation, String nurseIdentity, String nurseConstellation, String nurseAnimal, String nurseDescription) {
        nurseName = nurseName;
        nurseId = nurseId;
        nurseSex = nurseSex;
        nurseAge = nurseAge;
        nurseWorkAge = nurseWorkAge;
        nurseArea = nurseArea;
        nurseEvaluate = nurseEvaluate;
        nursePrice = nursePrice;
        nurseProtectArea = nurseProtectArea;
        nurseHeigt = nurseHeigt;
        nurseWeight = nurseWeight;
        nurseBloodType = nurseBloodType;
        nurseNation = nurseNation;
        nurseIdentity = nurseIdentity;
        nurseConstellation = nurseConstellation;
        nurseAnimal = nurseAnimal;
        nurseDescription = nurseDescription;
    }

    public String getNurseName() {
        return nurseName;
    }

    public void setNurseName(String nurseName) {
        nurseName = nurseName;
    }

    public int getNurseAge() {
        return nurseAge;
    }

    public void setNurseAge(int nurseAge) {
        nurseAge = nurseAge;
    }

    public String getNurseSex() {
        return nurseSex;
    }

    public void setNurseSex(String nurseSex) {
        nurseSex = nurseSex;
    }

    public String getNurseArea() {
        return nurseArea;
    }

    public void setNurseArea(String nurseArea) {
        nurseArea = nurseArea;
    }

    public int getNurseEvaluate() {
        return nurseEvaluate;
    }

    public void setNurseEvaluate(int nurseEvaluate) {
        nurseEvaluate = nurseEvaluate;
    }

    public int getNursePrice() {
        return nursePrice;
    }

    public void setNursePrice(int nursePrice) {
        nursePrice = nursePrice;
    }

    public String[] getNurseProtectArea() {
        return nurseProtectArea;
    }

    public void setNurseProtectArea(String[] nurseProtectArea) {
        nurseProtectArea = nurseProtectArea;
    }

    public int getNurseId() {
        return NurseId;
    }

    public void setNurseId(int nurseId) {
        nurseId = nurseId;
    }

    public int getNurseWorkAge() {
        return nurseWorkAge;
    }

    public void setNurseWorkAge(int nurseWorkAge) {
        nurseWorkAge = nurseWorkAge;
    }

    public int getNurseHeigt() {
        return nurseHeigt;
    }

    public void setNurseHeigt(int nurseHeigt) {
        nurseHeigt = nurseHeigt;
    }

    public int getNurseWeight() {
        return nurseWeight;
    }

    public void setNurseWeight(int nurseWeight) {
        nurseWeight = nurseWeight;
    }

    public String getNurseBloodType() {
        return nurseBloodType;
    }

    public void setNurseBloodType(String nurseBloodType) {
        nurseBloodType = nurseBloodType;
    }

    public String getNurseNation() {
        return nurseNation;
    }

    public void setNurseNation(String nurseNation) {
        nurseNation = nurseNation;
    }

    public String getNurseIdentity() {
        return nurseIdentity;
    }

    public void setNurseIdentity(String nurseIdentity) {
        nurseIdentity = nurseIdentity;
    }

    public String getNurseConstellation() {
        return nurseConstellation;
    }

    public void setNurseConstellation(String nurseConstellation) {
        nurseConstellation = nurseConstellation;
    }

    public String getNurseAnimal() {
        return nurseAnimal;
    }

    public void setNurseAnimal(String nurseAnimal) {
        nurseAnimal = nurseAnimal;
    }

    public String getNurseDescription() {
        return nurseDescription;
    }

    public void setNurseDescription(String nurseDescription) {
        nurseDescription = nurseDescription;
    }
}