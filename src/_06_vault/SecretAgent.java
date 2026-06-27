package _06_vault;

public class SecretAgent {
	
		
	public SecretAgent() {
		
	}
	public boolean findCode(Vault vault) {
		for (int x = 0; x <= 1000000; x++) {
			vault.tryCode(x);
			if (vault.tryCode(x) == true) {
				System.out.println(x);
			}
		}
		return true;
		
		
	}
	
}

