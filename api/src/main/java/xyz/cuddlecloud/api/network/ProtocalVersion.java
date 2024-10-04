package xyz.cuddlecloud.api.network;

import xyz.cuddlecloud.api.annotation.Inject;

public final class ProtocalVersion {

	@Inject(target = "com.velocitypowered.api.network.ProtocolVersion#SUPPORTED_VERSION_STRING")
	public static final String SUPPORTED_VERSION_STRING = com.velocitypowered.api.network.ProtocolVersion.MAXIMUM_VERSION.getMostRecentSupportedVersion();
	
}
