package xyz.cuddlecloud.proxy.connection.util;

import com.velocitypowered.api.network.ProtocolVersion;
import com.velocitypowered.api.proxy.server.ServerPing;

import xyz.cuddlecloud.api.annotation.Get_a769db2b;
import xyz.cuddlecloud.api.annotation.Inject;
import xyz.cuddlecloud.proxy.VelocityServer;

public final class ServerListPingHandler {

	@Inject(target = "com.velocitypowered.proxy.connection.util#constructLocalPing()")
	public static final Get_a769db2b<ServerPing.Version, ProtocolVersion> VERSION = (version) -> {
		return new ServerPing.Version(version.getProtocol(), String.format("CuddleCloud Proxy %s (%s)", ProtocolVersion.SUPPORTED_VERSION_STRING ,VelocityServer.VERSION));
	};
}