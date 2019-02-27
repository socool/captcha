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
        String tmp = "";
        if (this.getRightOperand() == 1) {
            tmp = "One";
        } else if(this.getRightOperand() == 2) {
            tmp = "Two";
        } else if(this.getRightOperand() == 3) {
            tmp = "Three";
        }
        return String.format("%s %s %s",leftOperand,"+",tmp);
    }
}