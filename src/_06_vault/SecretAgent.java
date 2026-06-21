package _06_vault;

public class SecretAgent {
	
		
	SecretAgent agent = new SecretAgent();
		public boolean findCode(Vault vault) {
			for (int x = 0; x <= 1000000; x++) {
				vault.tryCode(x);
		//		if (tryCode(x) == true) {
						System.out.println(x);
					} else {
						System.out.println("-1");
					}
				}
				
			}
		
	

