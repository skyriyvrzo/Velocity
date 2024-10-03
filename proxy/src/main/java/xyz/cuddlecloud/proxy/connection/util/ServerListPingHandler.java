package xyz.cuddlecloud.proxy.connection.util;

import com.velocitypowered.api.network.ProtocolVersion;
import com.velocitypowered.api.proxy.server.ServerPing;

import xyz.cuddlecloud.proxy.VelocityServer;
import xyz.cuddlecloud.proxy.annotation.Get_a769db2b;

public final class ServerListPingHandler {

	/**
	 * {@link com.velocitypowered.proxy.connection.util#constructLocalPing()}
	 */
	public static final Get_a769db2b<ServerPing.Version, ProtocolVersion> VERSION = (version) -> {
		return new ServerPing.Version(version.getProtocol(), String.format("CuddleCloud (%s)", VelocityServer.VERSION));
	};
}