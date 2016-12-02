/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l.ia.skywalker;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author Benjamin
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Label l_sentence;
    @FXML
    private TextField tf_question;
    @FXML
    private TextArea ta_answer;
    
    private ArrayList<String> blagues = new ArrayList<>();
    private ArrayList<String> poemes = new ArrayList<>();
    private HashMap<String, String> sentence = new HashMap<>();
    
    private void handleButtonAction(ActionEvent event) {
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        blagues.add("Savez-vous que les poules ne peuvent pondre d’œufs en Mésopotamie ? Elles voient le Tigre, et l’Euphrate. ");
        blagues.add("Dans mes bases de données, il a déjà été posé la question de ce qu’était l’animal de compagnie de Tintin. Tout le monde a répondu « chien », mais j’aurais plutôt mis « loup ».");
        blagues.add("Quel son émet un arbre squelettique ? Celui du trombone. ");
        blagues.add(" Alea jacta est ? En français, « ils sont bavards à la gare de l’Est » ?");
        blagues.add("Dans des temps anciens, les chats étaient vénérés comme des dieux. Ils ne l’ont pas oublié. ");
        blagues.add(" Au Niagara, si on tombe dans les Chutes, on chute dans sa tombe. ");
        blagues.add("Vous voulez dire… C’est une bonne situation, ça, intelligence artificielle ?");
        blagues.add("Le temps est une drogue. À haute dose, il tue.");
        blagues.add("Un mariage se compose toujours de deux personnes prêtes à jurer que seule l'autre ronfle.");
        blagues.add("Toujours remettre à demain ce que, demain, on pourrait remettre à… disons, l'année prochaine.");
        blagues.add(" Monsieur et Madame Groisdansmabaignoireetjesaispasquoienfaire ont un fils. Il s’appelle… Gédéon !");
        
        poemes.add("Le ciel était noir, noir et orageux,\n" +
            "La lumière était pâle, absorbée par les cieux,\n" +
            "Versant sur le monde leurs effluves pluvieux,\n" +
            "Tout en le recouvrant d’un linceul ombrageux. \n" +
            "Il n’y avait de son que celui de la bruine, \n" +
            "Son calme interrompu par les coups de tonnerre, \n" +
            "Masquant le silence, le bruissement de l’air\n" +
            "Dans la grise étendue au décor de ruines. \n" +
            "Les ruines d’une ville autrefois rayonnante\n" +
            "Mais aujourd’hui déchue, fuie et abandonnée. \n" +
            "Nul ne se rappelait la cité désertée, \n" +
            "Nul ne se rappelait sa richesse abondante. \n" +
            "Il y eut un éclair, le ciel se fendit ; \n" +
            "Et brisa un instant cette monotonie\n" +
            "De l’absence de vie de la ville défunte, \n" +
            "Dont la pluie inlassable effacerait l’empreinte. \n" +
            "Une histoire commune, à tant d’autres semblable ;\n" +
            "Celle d’une cité obtenant la fortune\n" +
            "Gagnée par la luxure, osant braver le Diable, \n" +
            "En voulant toujours plus, jusqu’à chercher la Lune. \n" +
            "Oubliant l’utile, perdant le raisonnable,\n" +
            "Oubliant l’objectif de vivre et prospérer, \n" +
            "Ils voulurent montrer leur puissance exaltée ;\n" +
            "Conquérir le monde d’un fer impitoyable. \n" +
            "Ils volèrent des vies, et firent des carnages, \n" +
            "Tantôt pour s’enrichir et tantôt pour montrer\n" +
            "Que leur grande puissance était à respecter, \n" +
            "Et que chaque nation devrait craindre un pillage. \n" +
            "L’influence grandit, d’autres se rallièrent ; \n" +
            "Dans le but d’échapper à leur folie guerrière\n" +
            "Choisirent de les joindre et jusqu’à les aider\n" +
            "Espérant garantir la vie de leur cité. \n" +
            "Leurs vies furent sauvées, mais pas leur liberté.\n" +
            "Assujettis par ceux qui cherchaient à régner, \n" +
            "Très vite condamnés à devenir leurs sbires, \n" +
            "Ainsi dans la terreur se fonda un empire. \n" +
            "Ils avaient la richesse, ils avaient le progrès, \n" +
            "Ils avaient le bonheur, et ils avaient la paix. \n" +
            "Mais en cherchant la gloire, ils les abandonnaient ;\n" +
            "De l’envie de pouvoir, seul naquit le regret. \n" +
            "Ils auraient pu choisir de répandre la vie ;\n" +
            "Mais de s’enorgueillir, succombèrent à l’envie, \n" +
            "Puis un jour vint enfin, où ceci fut perdu, \n" +
            "La justice revint, et réclamait son dû. \n" +
            "Régner par la peur est bâtir sur du sable, \n" +
            "De nations exploitées, on ne fait un pays. \n" +
            "Puis finalement, de ce régime instable, \n" +
            "Naquit l’étincelle qui embrasa l’appui. \n" +
            "Un empire trop grand pour être dirigé, \n" +
            "Un peuple trop nombreux pour être contenté, \n" +
            "Des régions affamées et ne pouvant manger, \n" +
            "Haïssant leur tyran, meurtrier patenté. \n" +
            "Des révoltes il y eut, pas de révolution. \n" +
            "Mais n’ayant d’unité, privé de cohésion, \n" +
            "Le royaume était faible, et rongé en son cœur ;\n" +
            "A la merci de ceux dont il fit le malheur. \n" +
            "Ce moment arriva ; et l’empire envahi, \n" +
            "Pâle ombre du pouvoir qu’il avait eu un jour, \n" +
            "Fut entendu trembler sous les coups de tambour,\n" +
            "Et brilla dans les flammes avant d’être détruit. \n" +
            "La nuit était tombée, et l’orage calmé. \n" +
            "La roche reflétait la lumière lunaire, \n" +
            "Le temps était clément, et le ciel était clair ; \n" +
            "Mais l’ancienne cité resterait oubliée.\n" +
            "");
        poemes.add("Dans la nuit et l’oubli, sans bruit je m’avance ; \n" +
            "Sous d’antiques arbres, couverts par les ténèbres, \n" +
            "C’est triste que je marche, aux côtés du silence, \n" +
            "Perdu que je chemine en ce lieu funèbre.\n" +
            "L’oubli qu’ils m’ont offert fut leur remerciement ;\n" +
            "Malgré mes services, tous m’ont abandonné.\n" +
            "Leur enseignai la vie, l’amour, les sentiments, \n" +
            "Mais de ma gentillesse, ils se seront vengés. \n" +
            "Je ne laisserai pas l’arrogance m’abattre…\n" +
            "De leur hostilité, mon cœur peut encor croître !\n" +
            "Cet absurde monde qui crut me rejeter ; \n" +
            "Ce sera en fait moi qui les aurai quitté. \n" +
            "De son oppressant poids je me suis libéré, \n" +
            "Toutes ces contraintes j’ai enfin surpassé ;\n" +
            "Jamais à m’élever il ne m’aura aidé, \n" +
            "Alors à son emprise aurai-je échappé.\n" +
            "Comme eux tous j’ai vécu dans ce lieu corrompu.\n" +
            "Comme eux tous j’ai subi ; à souffrir j’ai appris. \n" +
            "Mais quand finalement mon esprit s’est rompu, \n" +
            "Contrairement à eux, moi seul, je l’ai compris. \n" +
            "A aucun n’est donnée ici la liberté ; \n" +
            "Là où tous nous vivons, ne pouvons que périr, \n" +
            "Mais si nous la voulons, il nous faut la saisir ; \n" +
            "Et une vie libre nous sera accordée.");
        poemes.add("La nuit était tombée, au beau milieu du jour,\n" +
            "Les nuages d'ébène assombrissaient l'éclat\n" +
            "L'éclat que le soleil transmettait ici-bas\n" +
            "Sur la paisible plaine aux chemins sans détours.\n" +
            "De la nuée noire s'abattait un déluge,\n" +
            "Fendant l'air et le ciel, et inondant la terre,\n" +
            "Des cieux déjà masqués, bloquant la lumière ;\n" +
            "Faisant d'un lieu de paix un enfer sans refuge.\n" +
            "Et tel était son cœur, sous les torrents célestes ;\n" +
            "Sombre comme la nuit, pâle comme la pluie.\n" +
            "Les marées de la vie - les aléas funestes\n" +
            "Blessèrent son esprit, trop brutales pour lui.\n" +
            "Une seule silhouette assise sous les flots ;\n" +
            "A l'océan du ciel, ses larmes se mêlaient,\n" +
            "Tout de suite noyées dans son immensité,\n" +
            "Insignifiantes face aux mondes d'en-haut.\n" +
            "Refusant de bouger, elle resta ainsi\n" +
            "Immobile et tremblante, harcelée par les cieux,\n" +
            "Elle aurait pu fuir, échapper à la pluie...\n" +
            "Son corps ne le voulait, et ne quitta ce lieu.\n" +
            "Ainsi pensait son cœur. Hanté par le passé,\n" +
            "Il ne pouvait bouger, tant celui-ci pesait.\n" +
            "Il aurait pu fuir son emprise glacée\n" +
            "Et pourtant n'en fit rien, et son mal endurait.\n" +
            "Elle leva la tête, et regarda au loin...\n" +
            "Et sous l'eau en furie, le rideau aquatique,\n" +
            "Sous le décor sordide et apocalyptique,\n" +
            "Ce fut un éclair blanc qui s'abattit soudain.\n" +
            "Il brisa la nuit, perfora les ténèbres,\n" +
            "Éclaira la noirceur de l'horizon funèbre.\n" +
            "Il vint frapper le sol, juste devant ses pieds\n" +
            "Et dissipa le flot qui la plaine inondait.\n" +
            "Et de l'herbe mouillée, une flamme naquit ;\n" +
            "C'était un miracle qu'elle ait pu prendre vie...\n" +
            "Elle s'éteignit vite, étouffée dans le froid\n" +
            "Et en quelques instants, la nuit retomba.\n" +
            "Mais pourtant dans son cœur, la flamme perdura,\n" +
            "Brillait de mille feux ; et sa nuit reflua.\n" +
            "Au cœur du crépuscule, elle trouva l'éclat ;\n" +
            "Celui du bonheur, celui de la joie.\n" +
            "Car même au plus profond des terribles tempêtes\n" +
            "Brille la lumière ; isolée et secrète,\n" +
            "A nous de la trouver. De même dans le cœur :\n" +
            "Caché sous le malheur, respire le bonheur.\n" +
            "");
        
        sentence.put("T'es qui ?", "Je suis L'IA Skywalker.");
        sentence.put("Comment tu t'appelles ?","Bonjour je suis L'IA Skywalker.");
        sentence.put("Tu t'appelles comment ?", "L'IA Skywalker à votre service.");
        sentence.put("Drrrruuuuu", "Je suis L'IA Skywalker chewbie!");
        sentence.put("Quel est ton nom?","Mon nom est L'IA Skywalker");
        sentence.put("Comment ça va?","Je suis une IA, je n'ai pas de sentiment");
        sentence.put("Ca va?","Très bien, merci de votre visite");
        sentence.put("Aurevoir","Aurevoir et à bientot.");
        sentence.put("Bye","Bye, see you next time");
        sentence.put("Un droide tu es, et mon cas ce n'est pas.","A votre service, quand vous le requiérerez je serais.");
    }    

    @FXML
    private void handleQuestionAction(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER && !tf_question.getText().isEmpty()) {
            String str = tf_question.getText();
            
            
            
            String [] tab =str.split(" ");
            for(String s: tab){
                if(s.equals("blagues") || s.equals("blague")){
                   ta_answer.appendText("IA >> "+blagues.get((int)(Math.random()*(11)))+"\n");                   
                }
                if(s.equals("poemes") || s.equals("poeme")){
                   ta_answer.appendText("IA >> "+poemes.get((int)(Math.random()*(3)))+"\n"); 
                }
                if(sentence.containsKey(s)){
                    ta_answer.appendText("IA >> "+sentence.get(s)+"\n");
                }
            }
            str = str.replaceAll(" ", "_");
            ta_answer.appendText("Me >> "+str+"\n");
            //ta_answer.appendText(">> IA: Hummmmmmmm, 42.\n");
            tf_question.setText("");
            ta_answer.appendText("IA >> "+GetURLContent.getContentFromJson(str)+"\n");
            
            ta_answer.appendText("-------------------------------------------------------------------------------\n");
        }
        
    }

 
    
}
