package newLess;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.FileReader;
import java.io.IOException;

public class FileClass{
    public static void main(String[] args) {


        System.out.println("Данные из текстового файла:");
        System.out.println("____________________________");

        try{
            FileReader file = new FileReader("UserSettings.txt");

            int i;
            while((i = file.read())!= -1){
                System.out.print((char) i);
            }
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }


        System.out.println();
        System.out.println("____________________________");
        System.out.println();
        System.out.println("Данные из xml файла:");
        System.out.println("____________________________");


        try{
            // Создается построитель документа
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            // Создается дерево DOM документа из файла
            Document document = documentBuilder.parse("UserSettings.xml");

            // Получаем корневой элемент
            Node root = document.getDocumentElement();

            // Просматриваем все подэлементы корневого
            NodeList settings = root.getChildNodes();
            for(int i = 0; i < settings.getLength(); i++){
                Node setting = settings.item(i);
                // Если нода не текст, то это клиентские данные
                if (setting.getNodeType() != Node.TEXT_NODE){
                    NodeList setttingProps = setting.getChildNodes();
                    for(int j =0; j < setttingProps.getLength(); j++){
                        Node settingProp = setttingProps.item(j);
                        // Если нода не текст, то это один из параметров клиентских данных
                        if (settingProp.getNodeType() != Node.TEXT_NODE){
                            System.out.println(settingProp.getNodeName() + ": " + settingProp.getChildNodes().item(0).getTextContent());
                        }
                    }
                }
            }
            System.out.println("____________________________");

        }catch(IOException ex){
            System.out.println(ex.getMessage());
        } catch(ParserConfigurationException e){
            e.printStackTrace();
        } catch(SAXException e){
            e.printStackTrace();
        }


    }
}