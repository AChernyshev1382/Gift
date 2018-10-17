package newLess;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class FileClass{
    public static void main(String[] args){


        System.out.println("Данные из текстового файла:");
        System.out.println("____________________________");

        try{
            FileReader file=new FileReader("UserSettings.txt");



            int i;
            while((i=file.read())!=-1){
                System.out.print((char) i);
                //System.out.println(file.read());
            }

        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }






        System.out.println();
        System.out.println("____________________________");
        System.out.println();
        System.out.println("Данные из xml файла:");
        System.out.println("____________________________");


        try{
            // Создается построитель документа
            DocumentBuilder documentBuilder=DocumentBuilderFactory.newInstance().newDocumentBuilder();
            // Создается дерево DOM документа из файла
            Document document=documentBuilder.parse("UserSettings.xml");

            // Получаем корневой элемент
            Node root=document.getDocumentElement();

            // Просматриваем все подэлементы корневого
            NodeList settings=root.getChildNodes();
            for(int i=0; i<settings.getLength(); i++){
                Node setting=settings.item(i);
                // Если нода не текст, то это клиентские данные
                if(setting.getNodeType()!=Node.TEXT_NODE){
                    NodeList setttingProps=setting.getChildNodes();
                    for(int j=0; j<setttingProps.getLength(); j++){
                        Node settingProp=setttingProps.item(j);
                        // Если нода не текст, то это один из параметров клиентских данных
                        if(settingProp.getNodeType()!=Node.TEXT_NODE){
                            System.out.println(settingProp.getNodeName()+": "+settingProp.getChildNodes().item(0).getTextContent());
                        }
                    }
                }
            }
            System.out.println("____________________________");


            // Вызываем метод для добавления пользовательских настроек
            addNewSetting(document);

        } catch(IOException ex){
            System.out.println(ex.getMessage());
        } catch(ParserConfigurationException e){
            e.printStackTrace();
        } catch(SAXException e){
            e.printStackTrace();
        }


    }


    // Функция добавления новых данных и записи результата в файл
    private static void addNewSetting(Document document) throws TransformerFactoryConfigurationError, DOMException{
        // Получаем корневой элемент
        Node root=document.getDocumentElement();
        //Создаем новую настройку
        Element setting=document.createElement("Setting");
        // <UserName>
        Element userName=document.createElement("UserName");
        // Устанавливаем значение текста внутри тега
        userName.setTextContent("TestUser");
        //UserPassword
        Element userPassword=document.createElement("UserPassword");
        userPassword.setTextContent("TestPassword");


        setting.appendChild(userName);
        setting.appendChild(userPassword);

        root.appendChild(setting);

        writeDocument(document);

    }

    private static void writeDocument(Document document) throws TransformerFactoryConfigurationError{
        try{
            Transformer tr=TransformerFactory.newInstance().newTransformer();
            DOMSource source=new DOMSource(document);
            FileOutputStream fos=new FileOutputStream("NewUserSettimgs.xml");
            StreamResult result=new StreamResult(fos);
            tr.transform(source, result);

        } catch(TransformerException|IOException e){
            e.printStackTrace(System.out);
        }

    }
}