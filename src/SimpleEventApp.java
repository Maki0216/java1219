import java.awt.*;
import java.awt.event.*;

public class SimpleEventApp extends Frame implements ActionListener {

    // 宣告按鈕和標籤
    private Button button;
    private Label label;

    // 建構子
    public SimpleEventApp() {
        // 設定視窗標題
        super("Simple Event Example");

        // 設定版面佈局
        setLayout(new FlowLayout());

        // 初始化按鈕和標籤
        button = new Button("Click Me!");
        label = new Label("Button not clicked yet.");

        // 將元件加入視窗
        add(button);
        add(label);

        // 添加按鈕事件監聽器
        button.addActionListener(this);

        // 設定視窗大小
        setSize(300, 150);

        // 添加視窗關閉事件
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose(); // 關閉視窗
                System.exit(0); // 結束程式
            }
        });
    }

    // 處理按鈕的事件
    @Override
    public void actionPerformed(ActionEvent e) {
        // 修改標籤的文字
        label.setText("Button clicked! Hello, Java AWT!");
    }

    // 主程式
    public static void main(String[] args) {
        // 創建視窗物件
        SimpleEventApp app = new SimpleEventApp();
        app.setVisible(true); // 顯示視窗
    }
}
