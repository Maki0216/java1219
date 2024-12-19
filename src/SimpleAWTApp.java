import java.awt.*;
import java.awt.event.*;

public class SimpleAWTApp extends Frame implements ActionListener {

    // 宣告元件
    private TextField textField;
    private Button button;

    // 建構子
    public SimpleAWTApp() {
        // 設置視窗標題
        super("Simple AWT Example");

        // 設置版面佈局
        setLayout(new FlowLayout());

        // 初始化元件
        textField = new TextField(20); // 文字欄位，寬度為 20 字元
        button = new Button("Click Me!"); // 按鈕

        // 將元件加入視窗
        add(textField);
        add(button);

        // 添加按鈕的事件監聽器
        button.addActionListener(this);

        // 設置視窗大小
        setSize(300, 200);

        // 添加視窗關閉事件
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose(); // 關閉視窗
                System.exit(0); // 結束程式
            }
        });
    }

    // 處理按鈕點擊事件
    @Override
    public void actionPerformed(ActionEvent e) {
        textField.setText("Hello, AWT!"); // 在文字欄位顯示訊息
    }

    // 主程式
    public static void main(String[] args) {
        // 創建視窗
        SimpleAWTApp app = new SimpleAWTApp();
        app.setVisible(true); // 顯示視窗
    }
}
