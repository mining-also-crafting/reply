package com.reply;

import com.reply.Reply;
import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Reply implements DedicatedServerModInitializer {

	public static String ID = "reply";
    public static final Logger LOGGER = LoggerFactory.getLogger(Reply.class);

	@Override
	public void onInitializeServer() {
		registerCommands();
	}

	public void registerCommands() {
		CommandRegistrationCallback.EVENT.register((dispatcher, dedicatedServer, commandFunction) -> {
			Command.register(dispatcher);
		});
	}
}