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
            "Tout en le recouvrant d’un linceul ombrageux. \n\n" +
            "Il n’y avait de son que celui de la bruine, \n" +
            "Son calme interrompu par les coups de tonnerre, \n" +
            "Masquant le silence, le bruissement de l’air\n" +
            "Dans la grise étendue au décor de ruines. \n\n" +
            "Les ruines d’une ville autrefois rayonnante\n" +
            "Mais aujourd’hui déchue, fuie et abandonnée. \n" +
            "Nul ne se rappelait la cité désertée, \n" +
            "Nul ne se rappelait sa richesse abondante. \n\n" +
            "Il y eut un éclair, le ciel se fendit ; \n" +
            "Et brisa un instant cette monotonie\n" +
            "De l’absence de vie de la ville défunte, \n" +
            "Dont la pluie inlassable effacerait l’empreinte. \n\n" +
            "Une histoire commune, à tant d’autres semblable ;\n" +
            "Celle d’une cité obtenant la fortune\n" +
            "Gagnée par la luxure, osant braver le Diable, \n" +
            "En voulant toujours plus, jusqu’à chercher la Lune. \n\n" +
            "Oubliant l’utile, perdant le raisonnable,\n" +
            "Oubliant l’objectif de vivre et prospérer, \n" +
            "Ils voulurent montrer leur puissance exaltée ;\n" +
            "Conquérir le monde d’un fer impitoyable. \n\n" +
            "Ils volèrent des vies, et firent des carnages, \n" +
            "Tantôt pour s’enrichir et tantôt pour montrer\n" +
            "Que leur grande puissance était à respecter, \n" +
            "Et que chaque nation devrait craindre un pillage. \n\n" +
            "L’influence grandit, d’autres se rallièrent ; \n" +
            "Dans le but d’échapper à leur folie guerrière\n" +
            "Choisirent de les joindre et jusqu’à les aider\n" +
            "Espérant garantir la vie de leur cité. \n\n" +
            "Leurs vies furent sauvées, mais pas leur liberté.\n" +
            "Assujettis par ceux qui cherchaient à régner, \n" +
            "Très vite condamnés à devenir leurs sbires, \n" +
            "Ainsi dans la terreur se fonda un empire. \n\n" +
            "Ils avaient la richesse, ils avaient le progrès, \n" +
            "Ils avaient le bonheur, et ils avaient la paix. \n" +
            "Mais en cherchant la gloire, ils les abandonnaient ;\n" +
            "De l’envie de pouvoir, seul naquit le regret. \n\n" +
            "Ils auraient pu choisir de répandre la vie ;\n" +
            "Mais de s’enorgueillir, succombèrent à l’envie, \n" +
            "Puis un jour vint enfin, où ceci fut perdu, \n" +
            "La justice revint, et réclamait son dû. \n\n"+
            "Régner par la peur est bâtir sur du sable, \n" +
            "De nations exploitées, on ne fait un pays. \n" +
            "Puis finalement, de ce régime instable, \n" +
            "Naquit l’étincelle qui embrasa l’appui. \n\n" +
            "Un empire trop grand pour être dirigé, \n" +
            "Un peuple trop nombreux pour être contenté, \n" +
            "Des régions affamées et ne pouvant manger, \n" +
            "Haïssant leur tyran, meurtrier patenté. \n\n" +
            "Des révoltes il y eut, pas de révolution. \n" +
            "Mais n’ayant d’unité, privé de cohésion, \n" +
            "Le royaume était faible, et rongé en son cœur ;\n" +
            "A la merci de ceux dont il fit le malheur. \n\n" +
            "Ce moment arriva ; et l’empire envahi, \n" +
            "Pâle ombre du pouvoir qu’il avait eu un jour, \n" +
            "Fut entendu trembler sous les coups de tambour,\n" +
            "Et brilla dans les flammes avant d’être détruit. \n\n" +
            "La nuit était tombée, et l’orage calmé. \n" +
            "La roche reflétait la lumière lunaire, \n" +
            "Le temps était clément, et le ciel était clair ; \n" +
            "Mais l’ancienne cité resterait oubliée.\n\n" +
            "");
        poemes.add("Dans la nuit et l’oubli, sans bruit je m’avance ; \n" +
            "Sous d’antiques arbres, couverts par les ténèbres, \n" +
            "C’est triste que je marche, aux côtés du silence, \n" +
            "Perdu que je chemine en ce lieu funèbre.\n\n" +
            "L’oubli qu’ils m’ont offert fut leur remerciement ;\n" +
            "Malgré mes services, tous m’ont abandonné.\n" +
            "Leur enseignai la vie, l’amour, les sentiments, \n" +
            "Mais de ma gentillesse, ils se seront vengés. \n\n" +
            "Je ne laisserai pas l’arrogance m’abattre…\n" +
            "De leur hostilité, mon cœur peut encor croître !\n" +
            "Cet absurde monde qui crut me rejeter ; \n" +
            "Ce sera en fait moi qui les aurai quitté. \n\n" +
            "De son oppressant poids je me suis libéré, \n" +
            "Toutes ces contraintes j’ai enfin surpassé ;\n" +
            "Jamais à m’élever il ne m’aura aidé, \n" +
            "Alors à son emprise aurai-je échappé.\n\n" +
            "Comme eux tous j’ai vécu dans ce lieu corrompu.\n" +
            "Comme eux tous j’ai subi ; à souffrir j’ai appris. \n" +
            "Mais quand finalement mon esprit s’est rompu, \n" +
            "Contrairement à eux, moi seul, je l’ai compris. \n\n" +
            "A aucun n’est donnée ici la liberté ; \n" +
            "Là où tous nous vivons, ne pouvons que périr, \n" +
            "Mais si nous la voulons, il nous faut la saisir ; \n" +
            "Et une vie libre nous sera accordée.\n\n");
        poemes.add("La nuit était tombée, au beau milieu du jour,\n" +
            "Les nuages d'ébène assombrissaient l'éclat\n" +
            "L'éclat que le soleil transmettait ici-bas\n" +
            "Sur la paisible plaine aux chemins sans détours.\n\n" +
            "De la nuée noire s'abattait un déluge,\n" +
            "Fendant l'air et le ciel, et inondant la terre,\n" +
            "Des cieux déjà masqués, bloquant la lumière ;\n" +
            "Faisant d'un lieu de paix un enfer sans refuge.\n\n" +
            "Et tel était son cœur, sous les torrents célestes ;\n" +
            "Sombre comme la nuit, pâle comme la pluie.\n" +
            "Les marées de la vie - les aléas funestes\n" +
            "Blessèrent son esprit, trop brutales pour lui.\n\n" +
            "Une seule silhouette assise sous les flots ;\n" +
            "A l'océan du ciel, ses larmes se mêlaient,\n" +
            "Tout de suite noyées dans son immensité,\n" +
            "Insignifiantes face aux mondes d'en-haut.\n\n" +
            "Refusant de bouger, elle resta ainsi\n" +
            "Immobile et tremblante, harcelée par les cieux,\n" +
            "Elle aurait pu fuir, échapper à la pluie...\n" +
            "Son corps ne le voulait, et ne quitta ce lieu.\n\n" +
            "Ainsi pensait son cœur. Hanté par le passé,\n" +
            "Il ne pouvait bouger, tant celui-ci pesait.\n" +
            "Il aurait pu fuir son emprise glacée\n" +
            "Et pourtant n'en fit rien, et son mal endurait.\n\n" +
            "Elle leva la tête, et regarda au loin...\n" +
            "Et sous l'eau en furie, le rideau aquatique,\n" +
            "Sous le décor sordide et apocalyptique,\n" +
            "Ce fut un éclair blanc qui s'abattit soudain.\n\n" +
            "Il brisa la nuit, perfora les ténèbres,\n" +
            "Éclaira la noirceur de l'horizon funèbre.\n" +
            "Il vint frapper le sol, juste devant ses pieds\n" +
            "Et dissipa le flot qui la plaine inondait.\n\n" +
            "Et de l'herbe mouillée, une flamme naquit ;\n" +
            "C'était un miracle qu'elle ait pu prendre vie...\n" +
            "Elle s'éteignit vite, étouffée dans le froid\n" +
            "Et en quelques instants, la nuit retomba.\n\n" +
            "Mais pourtant dans son cœur, la flamme perdura,\n" +
            "Brillait de mille feux ; et sa nuit reflua.\n" +
            "Au cœur du crépuscule, elle trouva l'éclat ;\n" +
            "Celui du bonheur, celui de la joie.\n\n" +
            "Car même au plus profond des terribles tempêtes\n" +
            "Brille la lumière ; isolée et secrète,\n" +
            "A nous de la trouver. De même dans le cœur :\n" +
            "Caché sous le malheur, respire le bonheur.\n\n" +
            "");
         poemes.add("Un rayon de soleil par l’onde reflété\n" +
        "Frappant de son éclat le roc immaculé\n" +
        "De la falaise abrupte où s’écrasait la mer\n" +
        "Dans le triste fracas d’une défaite amère. \n \n" +
        "\n" +
        "Déjà plusieurs siècles que dure ce combat\n" +
        "Celui de l’océan, de cette immensité\n" +
        "Qui depuis tout ce temps, sur la terre s’abat\n" +
        "Pour reprendre le bien de leur éternité. \n\n" +
        "\n" +
        "Les éons passèrent, mais rien ne changea. \n" +
        "La roche s’effrita, un mont entier mourut ; \n" +
        "Mais malgré l’érosion, et la terre déchue, \n" +
        "Elle ne céda pas, et tout continua. \n\n" +
        "\n" +
        "Un combat de titans invisible aux humains\n" +
        "Faisant rage à leurs pieds, et sans qu’ils le remarquent\n" +
        "Ne laissant pas de trace ou de visible marque\n" +
        "Mais perdure le choc, éternel lendemain…\n\n" +
        "\n" +
        "Tous ces jours semblables, pareils aux précédents\n" +
        "Etaient le théâtre d’inlassables assauts\n" +
        "Tous nous les oublions, ces cris de l’océan…\n" +
        "Mais un jour nous perdrons, submergés par les flots. \n");
         
        poemes.add("Dans la brume de l’aube, au lever du soleil, \n" +
            "Dans l’herbe où la rosée commençait à tomber ; \n" +
            "Sous les yeux d’un hibou combattant son sommeil, \n" +
            "Une flamme jaillit d’une roche brisée. \n\n" +
            "\n" +
            "Elle mourut bientôt, happée dans la bruine\n" +
            "S’éteignant aussitôt qu’elle quitta la pierre\n" +
            "Si quelqu’un regardât le roc en ruines\n" +
            "Il y eût découvert l’entrée d’un cimetière. \n \n" +
            "\n" +
            "Sous la roche, un cratère, une faille s’ouvrait\n" +
            "Falaise dévastée, ravagée par les flammes\n" +
            "Aux parois antiques changées en noires lames\n" +
            "Crépitant sous le vent où braises voletaient. \n\n" +
            "\n" +
            "Au cœur de la nature, au milieu de la plaine, \n" +
            "Dans l’étendue paisible où fleurissait la vie, \n" +
            "C’est un enfer caché qui sous le sol naquît, \n" +
            "Né d’une maladie, maladie d’une graine. \n \n" +
            "\n" +
            "Et des années durant, cet enfer progressa ; \n" +
            "Ni vu ni remarqué, son emprise étendit. \n" +
            "Dans ce lieu désert et cœur d’un paradis, \n" +
            "Insuffla en secret l’aune de son trépas. \n\n\n\n" +
            "\n" +
            "La silhouette s’assit sur la branche d’un arbre. \n" +
            "Au cœur d’une forêt encor inhabitée ;\n" +
            "Mais le flot des ruisseaux le laissait inchangé, \n" +
            "Sous les chants des oiseaux, il demeurait de marbre. \n\n" +
            "\n" +
            "Son âme était fermée aux beautés de la vie ; \n" +
            "Jadis forte et pure, vibrante de bonté, \n" +
            "Mais un jour cependant, elle fut enrayée, \n" +
            "Blessée par une épine que jamais il ne vit. \\n\n" +
            "\n" +
            "Son cœur était la plaine, embaumée de soleil, \n" +
            "Plaine qu’un jour un mal frappa dans le silence, \n" +
            "Où le démon grandit, croissant son influence\n" +
            "Jusqu’à plonger le jour dans un sombre sommeil. \n\n" +
            "\n" +
            "Car un jour, une action, un simple évènement\n" +
            "Marqua son cœur joyeux, l’espace d’un instant. \n" +
            "Il aurait pu guérir s’il s’était écouté ; \n" +
            "Choisit d’y rester sourd, et du mal s’aveugler. \n \n" +
            "\n" +
            "Ainsi germa la graine au cours de ces années, \n" +
            "Dans le terrain fertile offert par sa bonté ; \n" +
            "Elle s’envenima et jusqu’à le corrompre\n" +
            "Transformant le cœur pur pour finir par le rompre. \n \n" +
            "\n" +
            "Et ainsi souffrait-il, ressentant à présent\n" +
            "La morsure du mal qui si longtemps fut là ; \n" +
            "Ayant l’esprit meurtri, brisé par ces tourments, \n" +
            "Il ne put que chuter, dans le noir bascula. \n \n" +
            "\n" +
            "Venu dans la forêt pour tenter de guérir, \n" +
            "Il s’aperçut alors qu’il était bien trop tard. \n" +
            "Que du venin létal, ne put ôter le dard, \n" +
            "Que sa fin arrivait, et qu’il allait mourir. \n \n" +
            "\n" +
            "Quelques années plus tôt, il aurait pu survivre ; \n" +
            "S’il eût en ce jour-là affronté son malheur, \n" +
            "S’il eût vaincu ce mal alors qu’était son heure, \n" +
            "Il pût le repousser, et sa vie poursuivre…\n\n\n\n" +
            "\n" +
            "\n" +
            "La nuit était tombée. Ni lune, ni étoiles ; \n" +
            "Les ombres recouvraient le plateau entier, \n" +
            "Et les seules lueurs à traverser le voile\n" +
            "Provenaient du cratère… et de l’obscurité. \n \n" +
            "\n" +
            "Un éclat s’alluma, brilla dans la pénombre, \n" +
            "Pour ensuite expirer après une seconde ; \n" +
            "La lueur de l’espoir au fond de son cœur sombre, \n" +
            "Semblable à un écho, une vague dans l’onde. \n \n" +
            "\n" +
            "Etouffé par la nuit tel le soleil du soir, \n" +
            "Il disparut alors, définitivement ; \n" +
            "Ne pouvant enfin plus affronter ses tourments, \n" +
            "Son âme lâcha prise et sombra dans le noir. Dans la brume de l’aube, au lever du soleil, \n" +
            "Dans l’herbe où la rosée commençait à tomber ; \n" +
            "Sous les yeux d’un hibou combattant son sommeil, \n" +
            "Une flamme jaillit d’une roche brisée. \n\n" +
            "\n" +
            "Elle mourut bientôt, happée dans la bruine\n" +
            "S’éteignant aussitôt qu’elle quitta la pierre\n" +
            "Si quelqu’un regardât le roc en ruines\n" +
            "Il y eût découvert l’entrée d’un cimetière. \n \n" +
            "\n" +
            "Sous la roche, un cratère, une faille s’ouvrait\n" +
            "Falaise dévastée, ravagée par les flammes\n" +
            "Aux parois antiques changées en noires lames\n" +
            "Crépitant sous le vent où braises voletaient. \n\n" +
            "\n" +
            "Au cœur de la nature, au milieu de la plaine, \n" +
            "Dans l’étendue paisible où fleurissait la vie, \n" +
            "C’est un enfer caché qui sous le sol naquît, \n" +
            "Né d’une maladie, maladie d’une graine. \n \n" +
            "\n" +
            "Et des années durant, cet enfer progressa ; \n" +
            "Ni vu ni remarqué, son emprise étendit. \n" +
            "Dans ce lieu désert et cœur d’un paradis, \n" +
            "Insuffla en secret l’aune de son trépas. \n\\n\\n\n" +
            "\n" +
            "La silhouette s’assit sur la branche d’un arbre. \n" +
            "Au cœur d’une forêt encor inhabitée ;\n" +
            "Mais le flot des ruisseaux le laissait inchangé, \n" +
            "Sous les chants des oiseaux, il demeurait de marbre. \n\n" +
            "\n" +
            "Son âme était fermée aux beautés de la vie ; \n" +
            "Jadis forte et pure, vibrante de bonté, \n" +
            "Mais un jour cependant, elle fut enrayée, \n" +
            "Blessée par une épine que jamais il ne vit. \n\n" +
            "\n" +
            "Son cœur était la plaine, embaumée de soleil, \n" +
            "Plaine qu’un jour un mal frappa dans le silence, \n" +
            "Où le démon grandit, croissant son influence\n" +
            "Jusqu’à plonger le jour dans un sombre sommeil. \n\n" +
            "\n" +
            "Car un jour, une action, un simple évènement\n" +
            "Marqua son cœur joyeux, l’espace d’un instant. \n" +
            "Il aurait pu guérir s’il s’était écouté ; \n" +
            "Choisit d’y rester sourd, et du mal s’aveugler. \n \n" +
            "\n" +
            "Ainsi germa la graine au cours de ces années, \n" +
            "Dans le terrain fertile offert par sa bonté ; \n" +
            "Elle s’envenima et jusqu’à le corrompre\n" +
            "Transformant le cœur pur pour finir par le rompre. \n \n" +
            "\n" +
            "Et ainsi souffrait-il, ressentant à présent\n" +
            "La morsure du mal qui si longtemps fut là ; \n" +
            "Ayant l’esprit meurtri, brisé par ces tourments, \n" +
            "Il ne put que chuter, dans le noir bascula. \n \n" +
            "\n" +
            "Venu dans la forêt pour tenter de guérir, \n" +
            "Il s’aperçut alors qu’il était bien trop tard. \n" +
            "Que du venin létal, ne put ôter le dard, \n" +
            "Que sa fin arrivait, et qu’il allait mourir. \n \n" +
            "\n" +
            "Quelques années plus tôt, il aurait pu survivre ; \n" +
            "S’il eût en ce jour-là affronté son malheur, \n" +
            "S’il eût vaincu ce mal alors qu’était son heure, \n" +
            "Il pût le repousser, et sa vie poursuivre…\n\\n\\n\n" +
            "\n" +
            "\n" +
            "La nuit était tombée. Ni lune, ni étoiles ; \n" +
            "Les ombres recouvraient le plateau entier, \n" +
            "Et les seules lueurs à traverser le voile\n" +
            "Provenaient du cratère… et de l’obscurité. \n \n" +
            "\n" +
            "Un éclat s’alluma, brilla dans la pénombre, \n" +
            "Pour ensuite expirer après une seconde ; \n" +
            "La lueur de l’espoir au fond de son cœur sombre, \n" +
            "Semblable à un écho, une vague dans l’onde. \n \n" +
            "\n" +
            "Etouffé par la nuit tel le soleil du soir, \n" +
            "Il disparut alors, définitivement ; \n" +
            "Ne pouvant enfin plus affronter ses tourments, \n" +
            "Son âme lâcha prise et sombra dans le noir. \n \n ");
        
        sentence.put("Bonjour", "Que puis-je faire pour vous ?");
        sentence.put("bonjour", "Que puis-je faire pour vous ?");
        sentence.put("T'es_qui_?", "Je suis L'IA Skywalker.");
        sentence.put("Comment_tu_t'appelles_?","Bonjour je suis L'IA Skywalker.");
        sentence.put("Tu_t'appelles_comment_?", "L'IA Skywalker à votre service.");
        sentence.put("Drrrruuuuu", "Je suis L'IA Skywalker chewbie!");
        sentence.put("Quel_est_ton_nom_?","Mon nom est L'IA Skywalker");
        sentence.put("Comment_ça_va_?","Je suis une IA, je n'ai pas de sentiment");
        sentence.put("Ca_va_?","Très bien, merci de votre visite");
        sentence.put("Aurevoir","Aurevoir et à bientot.");
        sentence.put("Bye","Bye, see you next time");
        sentence.put("Un_droide_tu_es,_et_mon_cas_ce_n'est_pas.","A votre service, quand vous le requiérerez je serais.");
        
        ta_answer.appendText("IA>> Bonjour.\n");
    }    

    @FXML
    private void handleQuestionAction(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER && !tf_question.getText().isEmpty()) {
            String str = tf_question.getText();
            String str2 = str.replaceAll(" ", "_");
            Boolean b =false;
            ta_answer.appendText("Me >> "+str+"\n");
            
            
            String [] tab =str.split(" ");
            for(String s: tab){
                if(s.equals("blagues") || s.equals("blague")){
                   ta_answer.appendText("IA>> Voici une blague:\n");
                   ta_answer.appendText("IA >> "+blagues.get((int)(Math.random()*(11)))+"\n");
                   b = true;
                }
                if(s.equals("poemes") || s.equals("poeme")){
                   ta_answer.appendText("IA>> Voici un poeme:\n");
                   ta_answer.appendText("IA >> "+poemes.get((int)(Math.random()*(5)))+"\n"); 
                   b = true;
                }
            }
            if(sentence.containsKey(str2)){
                ta_answer.appendText("IA >> "+sentence.get(str2)+"\n");
                b = true;
            }
            
            if(!b){
                str = str.replaceAll(" ", "_");
                if(GetURLContent.getContentFromJson(str).isEmpty()){
                    ta_answer.appendText("IA >> Je n'ai rien trouvé pour : "+(str.toUpperCase()).replaceAll("_"," ")+"\nEssayez avec des mots clés.\n");
                }else{ 
                    ta_answer.appendText("IA >> Voici ce que j'ai trouvé pour "+(str.toUpperCase()).replaceAll("_"," ")+":\n");
                    ta_answer.appendText("   "+GetURLContent.getContentFromJson(str)+"\n");
                    ta_answer.appendText("-------------------------------------------------------------------------------\n");
                }
            }
            tf_question.setText("");
            ta_answer.appendText("\n");
            
            
        }
        
    }

 
    
}
