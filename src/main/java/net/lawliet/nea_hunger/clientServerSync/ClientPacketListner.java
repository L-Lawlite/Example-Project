package net.lawliet.nea_hunger.clientServerSync;

import net.neoforged.neoforge.network.handling.IPayloadContext;

public class ClientPacketListner {

    public static int hungerSprintValue;

    public static void handleDataOnNetwork(final PlayerSyncPacket playerSyncPacket, IPayloadContext context) {
        hungerSprintValue = playerSyncPacket.hungerSprintValue();
    }
}
