package com.lihuan.Practice.GuessNumber;

public class GuessNumber {
    //要猜的数
    private int num;
    //猜的次数
    private int numGuesses;
    //回复的内容
    private String answer;
    //猜的是否正确
    private boolean success;
    //提示
    private String hint;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNumGuesses() {
        return numGuesses;
    }

    public void setNumGuesses(int numGuesses) {
        this.numGuesses = numGuesses;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getHint() {
        return hint;
    }

    /**
     * 设置提示
     */
    public void setHint() {
        int ans = Integer.parseInt(answer.trim());
        if (num < ans) {
            this.hint = "higher";
        } else if (num > ans) {
            this.hint = "lower";
        }
    }
}
