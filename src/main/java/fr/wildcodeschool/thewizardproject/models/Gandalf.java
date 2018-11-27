package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component("idGandalf")
public class Gandalf implements WizardInterface {

	private Outfit myWizardDress;

	public void setMyWizardDress(Outfit myWizardDress) {
		this.myWizardDress = myWizardDress;
	}

	@Override
	public String changeDress() {
		return myWizardDress.myOutfit();
	}

	@Override
	public String giveAdvice() {
		return " VOUS NE PASSEREZ PAS !!!";
	}

}
