package inc.flide.eightvim.keyboardHelpers;

import inc.flide.eightvim.structures.KeyboardActionType;

public class KeyboardAction {

    private KeyboardActionType keyboardActionType;
    private String text;
    private String capsLockText;
    private int keyEventCode;

    public KeyboardAction(KeyboardActionType keyboardActionType, String text, String capsLockText, int keyEventCode) {
        this.keyboardActionType = keyboardActionType;
        this.text = text;
        this.keyEventCode = keyEventCode;
        setCapsLockText(capsLockText);
    }

    private void setCapsLockText(String capsLockText) {
        if((capsLockText==null || capsLockText.length()==0) && this.text!=null){
            this.capsLockText = this.text.toUpperCase();
        } else{
            this.capsLockText = capsLockText;
        }
    }

    public String getText() {
        return text;
    }

    public int getKeyEventCode() {
        return keyEventCode;
    }

    public KeyboardActionType getKeyboardActionType() {
        return keyboardActionType;
    }

    public String getCapsLockText() { return capsLockText; }
}
