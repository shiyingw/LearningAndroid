package com.syw.learningandroid.main;

public class FragmentModel {

    private String buttonText;

    private String fragmentName;

    public FragmentModel() {
    }

    public FragmentModel(String buttonText, String fragmentName) {
        this.buttonText = buttonText;
        this.fragmentName = fragmentName;
    }

    public String getButtonText() {
        return buttonText;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    public String getFragmentName() {
        return fragmentName;
    }

    public void setFragmentName(String fragmentName) {
        this.fragmentName = fragmentName;
    }
}
