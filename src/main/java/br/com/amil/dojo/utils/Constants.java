package br.com.amil.dojo.utils;

public class Constants {
	public static final String REGEX_EVENTO_ASSASSINATO = "^(\\w+|<WORLD>) killed (\\w+|<WORLD>) (using|by) (\\w+)$";
	public static final String REGEX_EVENTO_INICIO_PARTIDA = "^New match (\\d+) has started$";
	public static final String REGEX_EVENTO_FIM_PARTIDA = "^Match (\\d+) has ended$";
	public static final String REGEX_DATE_LOG = "^(([1-9]|([012][0-9])|(3[01]))\\/([0]{0,1}[1-9]|1[012])\\/\\d\\d\\d\\d [012]{0,1}[0-9]:[0-6][0-9]:[0-6][0-9]) - (.*)$";
	public static final String FORMAT_DATE_LOG = "dd/MM/yyyy HH:mm:ss";
}
