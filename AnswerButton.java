/*
 * @Course: IST 240 (FA 14)
 * @Section: 001
 *
 * @Group 04
 * @Round 2
 */
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JOptionPane;

class AnswerButton extends JButton {
    String question,answer;
    AnswerButton(String text,String inputQuestion,String inputAnswer) {
        super();
        setOpaque(true);
        setBackground(Color.BLUE);
        setFont(new Font("Dialog", 1, 20));
        setText(text);
        question = inputQuestion;
        answer = inputAnswer;
    } 
    
    public void onButtonPressed()
    {
        //Display dialog with question
        displayQuestion();
        
        setEnabled(false);
    }
    
    public void displayQuestion()
    {
        String str = JOptionPane.showInputDialog(null, question, "", 1);
        if (true == isAnswerCorrect(str))
        {
            System.out.println("correct!");
        }
    }
    
    public boolean isAnswerCorrect(String input)
    {
        boolean returnValue = false;
        if (answer.equals(input))
        {
            returnValue = true;
        }
        return returnValue;
    }
}
