package family.thelooter.ddl.psm.osn;

import org.bukkit.permissions.Permission;

public class Permissions {
	
	public static Permission getNode(String perm) {
		Permission playerPermission = new Permission("psm.prefix.set.0");
		Permission playerPermission1 = new Permission("psm.prefix.set.1");
		Permission playerPermission2 = new Permission("psm.prefix.set.2");
		Permission playerPermission3 = new Permission("psm.prefix.set.3");
		Permission playerPermission4 = new Permission("psm.prefix.set.4");
		Permission playerPermission5 = new Permission("psm.prefix.set.5");
		Permission playerPermission6 = new Permission("psm.prefix.set.6");
		Permission playerPermission7 = new Permission("psm.prefix.set.7");
		Permission playerPermission8 = new Permission("psm.prefix.set.8");
		Permission playerPermission9 = new Permission("psm.prefix.set.9");
		Permission playerPermission10 = new Permission("psm.suffix.set.0");
		Permission playerPermission11 = new Permission("psm.suffix.set.1");
		Permission playerPermission12 = new Permission("psm.suffix.set.2");
		Permission playerPermission13 = new Permission("psm.suffix.set.3");
		Permission playerPermission14 = new Permission("psm.suffix.set.4");
		Permission playerPermission15 = new Permission("psm.suffix.set.5");
		Permission playerPermission16 = new Permission("psm.suffix.set.6");
		Permission playerPermission17 = new Permission("psm.suffix.set.7");
		Permission playerPermission18 = new Permission("psm.suffix.set.8");
		Permission playerPermission19 = new Permission("psm.suffix.set.9");
		Permission playerPermission20 = new Permission("psm.prefix.list");
		Permission playerPermission21 = new Permission("psm.prefix.help");
		Permission playerPermission22 = new Permission("psm.suffix.help");
		Permission playerPermission23 = new Permission("psm.suffix.list");
		Permission playerPermission24 = new Permission("psm.chat");
		if (perm == "psm.prefix.set.0") {
			return playerPermission;
		} else if (perm == "psm.prefix.set.1") {
			return playerPermission1;
		} else if (perm == "psm.prefix.set.2") {
			return playerPermission2;
		} else if (perm == "psm.prefix.set.3") {
			return playerPermission3;
		} else if (perm == "psm.prefix.set.4") {
			return playerPermission4;
		} else if (perm == "psm.prefix.set.5") {
			return playerPermission5;
		} else if (perm == "psm.prefix.set.6") {
			return playerPermission6;
		} else if (perm == "psm.prefix.set.7") {
			return playerPermission7;
		} else if (perm == "psm.prefix.set.8") {
			return playerPermission8;
		} else if (perm == "psm.prefix.set.9") {
			return playerPermission9;
		} else if (perm == "psm.suffix.set.0") {
			return playerPermission10;
		} else if (perm == "psm.suffix.set.1") {
			return playerPermission11;
		} else if (perm == "psm.suffix.set.2") {
			return playerPermission12;
		} else if (perm == "psm.suffix.set.3") {
			return playerPermission13;
		} else if (perm == "psm.suffix.set.4") {
			return playerPermission14;
		} else if (perm == "psm.suffix.set.5") {
			return playerPermission15;
		} else if (perm == "psm.suffix.set.6") {
			return playerPermission16;
		} else if (perm == "psm.suffix.set.7") {
			return playerPermission17;
		} else if (perm == "psm.suffix.set.8") {
			return playerPermission18;
		} else if (perm == "psm.suffix.set.9") {
			return playerPermission19;
		} else if (perm == "psm.prefix.list") {
			return playerPermission20;
		} else if (perm == "psm.prefix.help") {
			return playerPermission21;
		} else if (perm == "psm.suffix.help") {
			return playerPermission22;
		} else if (perm == "psm.suffix.list") {
			return playerPermission23;
		} else if (perm == "psm.chat") {
			return playerPermission24;
		} else {
			return null;
		}
	}
}