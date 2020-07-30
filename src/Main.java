import family.TranslateToEnglish;
import translator.Translator;

public class Main {

	public static void main(String[] args) {
		Translator eng = new Translator(new TranslateToEnglish());
		System.out.println(eng.translate("test"));
	}

}
