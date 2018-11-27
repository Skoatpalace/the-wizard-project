package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component("idDumbledore")
public class Dumbledore implements WizardInterface {

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
		return "Pour un esprit équilibré, la mort n'est qu'une grande aventure de plus";
	}

}
