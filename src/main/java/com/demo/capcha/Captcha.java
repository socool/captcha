package com.demo.capcha;

public class Captcha {
    private int pattern;
    private int leftOperand;
    private int operator;
    private int rightOperand;

    public int getPattern() {
        return pattern;
    }

    public void setPattern(int pattern) {
        this.pattern = pattern;
    }

    public int getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(int leftOperand) {
        this.leftOperand = leftOperand;
    }

    public int getOperator() {
        return operator;
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }

    public int getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(int rightOperand) {
        this.rightOperand = rightOperand;
    }

    public Captcha(int pattern, int leftOperand
            , int operator, int rightOperand) {
        this.setPattern(pattern);
        this.setLeftOperand(leftOperand);
        this.setOperator(operator);
        this.setRightOperand(rightOperand);
    }

    @Override
    public String toString() {
        if(this.getLeftOperand() == 1){
            return "1 + One";
        }else if(this.getLeftOperand() == 2){
            return "2 + One";
        }
        return "3 + One";

    }
}