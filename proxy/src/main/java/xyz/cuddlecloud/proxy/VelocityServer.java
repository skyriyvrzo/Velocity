package xyz.cuddlecloud.proxy;

import xyz.cuddlecloud.api.annotation.Inject;

public final class VelocityServer {

	public static final String VERSION = "2024.10.17.1";

	@Inject(target = "com.velocitypowered.proxy#getVersion()")
	public static final String IMPLNAME = String.format("CuddleCloud Proxy (%s)", VERSION);

	@Inject(target = "com.velocitypowered.proxy#getVersion()")
	public static final String IMPLVENDOR = "CuddleCloud Contributors";
}
