public class Decoding {
    private int mKey;
    private String mInputText;

    public Decoding(int key, String inputText) {
        mKey = key;
        mInputText = inputText;
    }
    public String getInputText() {
        return mInputText;
    }
    public int getKey() {
        return mKey;
    }
    public boolean isValidInputText()
    {
        char[] chars = mInputText.toCharArray();

        for (char c : chars) {
            if(!Character.isLetter(c) && c != ' ') {
                return false;
            }
        }
        return true;
    }
}
