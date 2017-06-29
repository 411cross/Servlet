package com.company.Entity;

/**
 * Created by Administrator on 2017/6/29.
 */
public class Nurse {
    private String NurseName; //姓名
    private int NurseId; //id
    private String NurseSex; //性别
    private int NurseAge;  //年龄
    private int NurseWorkAge; //护龄
    private String NurseArea; //地区
    private int NurseEvaluate; //评分
    private int NursePrice; //个人价格
    private String[] NurseProtectArea; //护理范围
    private int NurseHeigt; //身高
    private int NurseWeight; //体重
    private String NurseBloodType; //血型
    private String NurseNation;  //民族
    private String NurseIdentity; //身份证号码
    private String NurseConstellation; //星座
    private String NurseAnimal; //生肖
    private String NurseDescription; //个人介绍


    public Nurse(String nurseName, int nurseId, String nurseSex, int nurseAge, int nurseWorkAge, String nurseArea, int nurseEvaluate, int nursePrice, String[] nurseProtectArea, int nurseHeigt, int nurseWeight, String nurseBloodType, String nurseNation, String nurseIdentity, String nurseConstellation, String nurseAnimal, String nurseDescription) {
        NurseName = nurseName;
        NurseId = nurseId;
        NurseSex = nurseSex;
        NurseAge = nurseAge;
        NurseWorkAge = nurseWorkAge;
        NurseArea = nurseArea;
        NurseEvaluate = nurseEvaluate;
        NursePrice = nursePrice;
        NurseProtectArea = nurseProtectArea;
        NurseHeigt = nurseHeigt;
        NurseWeight = nurseWeight;
        NurseBloodType = nurseBloodType;
        NurseNation = nurseNation;
        NurseIdentity = nurseIdentity;
        NurseConstellation = nurseConstellation;
        NurseAnimal = nurseAnimal;
        NurseDescription = nurseDescription;
    }

    public String getNurseName() {
        return NurseName;
    }

    public void setNurseName(String nurseName) {
        NurseName = nurseName;
    }

    public int getNurseAge() {
        return NurseAge;
    }

    public void setNurseAge(int nurseAge) {
        NurseAge = nurseAge;
    }

    public String getNurseSex() {
        return NurseSex;
    }

    public void setNurseSex(String nurseSex) {
        NurseSex = nurseSex;
    }

    public String getNurseArea() {
        return NurseArea;
    }

    public void setNurseArea(String nurseArea) {
        NurseArea = nurseArea;
    }

    public int getNurseEvaluate() {
        return NurseEvaluate;
    }

    public void setNurseEvaluate(int nurseEvaluate) {
        NurseEvaluate = nurseEvaluate;
    }

    public int getNursePrice() {
        return NursePrice;
    }

    public void setNursePrice(int nursePrice) {
        NursePrice = nursePrice;
    }

    public String[] getNurseProtectArea() {
        return NurseProtectArea;
    }

    public void setNurseProtectArea(String[] nurseProtectArea) {
        NurseProtectArea = nurseProtectArea;
    }

    public int getNurseId() {
        return NurseId;
    }

    public void setNurseId(int nurseId) {
        NurseId = nurseId;
    }

    public int getNurseWorkAge() {
        return NurseWorkAge;
    }

    public void setNurseWorkAge(int nurseWorkAge) {
        NurseWorkAge = nurseWorkAge;
    }

    public int getNurseHeigt() {
        return NurseHeigt;
    }

    public void setNurseHeigt(int nurseHeigt) {
        NurseHeigt = nurseHeigt;
    }

    public int getNurseWeight() {
        return NurseWeight;
    }

    public void setNurseWeight(int nurseWeight) {
        NurseWeight = nurseWeight;
    }

    public String getNurseBloodType() {
        return NurseBloodType;
    }

    public void setNurseBloodType(String nurseBloodType) {
        NurseBloodType = nurseBloodType;
    }

    public String getNurseNation() {
        return NurseNation;
    }

    public void setNurseNation(String nurseNation) {
        NurseNation = nurseNation;
    }

    public String getNurseIdentity() {
        return NurseIdentity;
    }

    public void setNurseIdentity(String nurseIdentity) {
        NurseIdentity = nurseIdentity;
    }

    public String getNurseConstellation() {
        return NurseConstellation;
    }

    public void setNurseConstellation(String nurseConstellation) {
        NurseConstellation = nurseConstellation;
    }

    public String getNurseAnimal() {
        return NurseAnimal;
    }

    public void setNurseAnimal(String nurseAnimal) {
        NurseAnimal = nurseAnimal;
    }

    public String getNurseDescription() {
        return NurseDescription;
    }

    public void setNurseDescription(String nurseDescription) {
        NurseDescription = nurseDescription;
    }
}