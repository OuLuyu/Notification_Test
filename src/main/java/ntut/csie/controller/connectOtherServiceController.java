package ntut.csie.controller;

import java.util.*;
import ntut.csie.service.AccountService;

public class connectOtherServiceController {
	private AccountService mas = new AccountService();
	
	public List<String> GetAccountsIdByProjectId(int projectId)
	{
		List<String> accounts;
		if(mas.GetAccountsByProjectId(projectId))
		{
			accounts = mas.GetAccounts();
			return accounts;
		}
		
		return Collections.<String>emptyList();
	}
}
