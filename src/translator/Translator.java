package translator;

import interfaces.ITranslate;

//Client
public class Translator {
	private ITranslate translate;

	public Translator(ITranslate translate) {
		this.translate = translate;
	}

	public String translate(String input) {
		return translate.run(input);
	}
}
