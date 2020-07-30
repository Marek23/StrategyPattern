package family;

import interfaces.ITranslate;

public class TranslateToDeutch implements ITranslate{

	@Override
	public String run(String input) {
		return input + " should be translated to deutch";
	}

}
