package _06_vault;

public class VaultRunner {
	public static void main(String[] args) {
	
		Vault object = new Vault();
		SecretAgent agent = new SecretAgent();
		agent.findCode(object);
		
	}
}
