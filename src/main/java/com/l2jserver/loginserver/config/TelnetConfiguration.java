/*
 * Copyright © 2019 L2J Server
 *
 * This file is part of L2J Server.
 *
 * L2J Server is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * L2J Server is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.l2jserver.loginserver.config;

import java.util.List;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

/**
 * Telnet Configuration.
 * @author Zoey76
 * @version 2.6.1.1
 */
@Sources({
	"file:./config/telnet.properties",
	"classpath:config/telnet.properties"
})
public interface TelnetConfiguration extends Config {
	
	@Key("EnableTelnet")
	boolean isEnabled();
	
	@Key("Port")
	int getPort();
	
	@Key("Password")
	String getPassword();
	
	@Key("Hosts")
	List<String> getHosts();
}