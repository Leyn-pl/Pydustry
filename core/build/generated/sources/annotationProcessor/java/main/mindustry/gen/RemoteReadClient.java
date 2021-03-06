package mindustry.gen;

import java.nio.ByteBuffer;

/**
 * Autogenerated file. Do not modify!
 */
public class RemoteReadClient {
  public static void readPacket(ByteBuffer buffer, int id) {
    if(id == 0) {
      try {
        mindustry.game.Team team = mindustry.io.TypeIO.readTeam(buffer);
        int x = buffer.getInt();
        int y = buffer.getInt();
        mindustry.world.Build.beginBreak(team, x, y);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'beginBreak'!", e);
      }
    } else if(id == 1) {
      try {
        mindustry.game.Team team = mindustry.io.TypeIO.readTeam(buffer);
        int x = buffer.getInt();
        int y = buffer.getInt();
        mindustry.world.Block result = mindustry.io.TypeIO.readBlock(buffer);
        int rotation = buffer.getInt();
        mindustry.world.Build.beginPlace(team, x, y, result, rotation);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'beginPlace'!", e);
      }
    } else if(id == 3) {
      try {
        mindustry.entities.bullet.BulletType type = mindustry.io.TypeIO.readBulletType(buffer);
        mindustry.game.Team team = mindustry.io.TypeIO.readTeam(buffer);
        float x = buffer.getFloat();
        float y = buffer.getFloat();
        float angle = buffer.getFloat();
        float velocityScl = buffer.getFloat();
        float lifetimeScl = buffer.getFloat();
        mindustry.entities.type.Bullet.createBullet(type, team, x, y, angle, velocityScl, lifetimeScl);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'createBullet'!", e);
      }
    } else if(id == 4) {
      try {
        int seed = buffer.getInt();
        mindustry.game.Team team = mindustry.io.TypeIO.readTeam(buffer);
        arc.graphics.Color color = mindustry.io.TypeIO.readColor(buffer);
        float damage = buffer.getFloat();
        float x = buffer.getFloat();
        float y = buffer.getFloat();
        float rotation = buffer.getFloat();
        int length = buffer.getInt();
        mindustry.entities.effect.Lightning.createLighting(seed, team, color, damage, x, y, rotation, length);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'createLighting'!", e);
      }
    } else if(id == 6) {
      try {
        mindustry.core.NetClient.hideHudText();
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'hideHudText'!", e);
      }
    } else if(id == 7) {
      try {
        mindustry.core.Logic.launchZone();
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'launchZone'!", e);
      }
    } else if(id == 9) {
      try {
        short amount = buffer.getShort();
        short dataLen = buffer.getShort();
        byte[] data = mindustry.io.TypeIO.readBytes(buffer);
        mindustry.core.NetClient.onBlockSnapshot(amount, dataLen, data);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onBlockSnapshot'!", e);
      }
    } else if(id == 11) {
      try {
        java.lang.String ip = mindustry.io.TypeIO.readString(buffer);
        int port = buffer.getInt();
        mindustry.core.NetClient.onConnect(ip, port);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onConnect'!", e);
      }
    } else if(id == 12) {
      try {
        mindustry.world.Tile tile = mindustry.io.TypeIO.readTile(buffer);
        mindustry.world.Block block = mindustry.io.TypeIO.readBlock(buffer);
        int builderID = buffer.getInt();
        byte rotation = buffer.get();
        mindustry.game.Team team = mindustry.io.TypeIO.readTeam(buffer);
        boolean skipConfig = buffer.get() == 1;
        mindustry.world.blocks.BuildBlock.onConstructFinish(tile, block, builderID, rotation, team, skipConfig);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onConstructFinish'!", e);
      }
    } else if(id == 13) {
      try {
        mindustry.world.Tile tile = mindustry.io.TypeIO.readTile(buffer);
        mindustry.world.Block block = mindustry.io.TypeIO.readBlock(buffer);
        int builderID = buffer.getInt();
        mindustry.world.blocks.BuildBlock.onDeconstructFinish(tile, block, builderID);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onDeconstructFinish'!", e);
      }
    } else if(id == 14) {
      try {
        mindustry.entities.type.Player player = mindustry.io.TypeIO.readPlayer(buffer);
        mindustry.world.Tile tile = mindustry.io.TypeIO.readTile(buffer);
        boolean open = buffer.get() == 1;
        mindustry.world.blocks.defense.Door.onDoorToggle(player, tile, open);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onDoorToggle'!", e);
      }
    } else if(id == 15) {
      try {
        mindustry.entities.Effects.Effect effect = mindustry.io.TypeIO.readEffect(buffer);
        float x = buffer.getFloat();
        float y = buffer.getFloat();
        float rotation = buffer.getFloat();
        arc.graphics.Color color = mindustry.io.TypeIO.readColor(buffer);
        mindustry.core.NetClient.onEffect(effect, x, y, rotation, color);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onEffect'!", e);
      }
    } else if(id == 16) {
      try {
        mindustry.entities.Effects.Effect effect = mindustry.io.TypeIO.readEffect(buffer);
        float x = buffer.getFloat();
        float y = buffer.getFloat();
        float rotation = buffer.getFloat();
        arc.graphics.Color color = mindustry.io.TypeIO.readColor(buffer);
        mindustry.core.NetClient.onEffectReliable(effect, x, y, rotation, color);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onEffectReliable'!", e);
      }
    } else if(id == 17) {
      try {
        byte groupID = buffer.get();
        short amount = buffer.getShort();
        short dataLen = buffer.getShort();
        byte[] data = mindustry.io.TypeIO.readBytes(buffer);
        mindustry.core.NetClient.onEntitySnapshot(groupID, amount, dataLen, data);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onEntitySnapshot'!", e);
      }
    } else if(id == 18) {
      try {
        mindustry.game.Team winner = mindustry.io.TypeIO.readTeam(buffer);
        mindustry.core.Logic.onGameOver(winner);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onGameOver'!", e);
      }
    } else if(id == 19) {
      try {
        mindustry.entities.traits.ShooterTrait shooter = mindustry.io.TypeIO.readShooter(buffer);
        float x = buffer.getFloat();
        float y = buffer.getFloat();
        float rotation = buffer.getFloat();
        boolean left = buffer.get() == 1;
        mindustry.type.Weapon.onGenericShootWeapon(shooter, x, y, rotation, left);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onGenericShootWeapon'!", e);
      }
    } else if(id == 20) {
      try {
        java.lang.String message = mindustry.io.TypeIO.readString(buffer);
        mindustry.core.NetClient.onInfoMessage(message);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onInfoMessage'!", e);
      }
    } else if(id == 21) {
      try {
        java.lang.String message = mindustry.io.TypeIO.readString(buffer);
        float duration = buffer.getFloat();
        int align = buffer.getInt();
        int top = buffer.getInt();
        int left = buffer.getInt();
        int bottom = buffer.getInt();
        int right = buffer.getInt();
        mindustry.core.NetClient.onInfoPopup(message, duration, align, top, left, bottom, right);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onInfoPopup'!", e);
      }
    } else if(id == 22) {
      try {
        java.lang.String message = mindustry.io.TypeIO.readString(buffer);
        float duration = buffer.getFloat();
        mindustry.core.NetClient.onInfoToast(message, duration);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onInfoToast'!", e);
      }
    } else if(id == 23) {
      try {
        java.lang.String reason = mindustry.io.TypeIO.readString(buffer);
        mindustry.core.NetClient.onKick(reason);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onKick'!", e);
      }
    } else if(id == 24) {
      try {
        mindustry.net.Packets.KickReason reason = mindustry.io.TypeIO.readKick(buffer);
        mindustry.core.NetClient.onKick(reason);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onKick'!", e);
      }
    } else if(id == 25) {
      try {
        java.lang.String message = mindustry.io.TypeIO.readString(buffer);
        float duration = buffer.getFloat();
        float worldx = buffer.getFloat();
        float worldy = buffer.getFloat();
        mindustry.core.NetClient.onLabel(message, duration, worldx, worldy);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onLabel'!", e);
      }
    } else if(id == 26) {
      try {
        mindustry.world.Tile tile = mindustry.io.TypeIO.readTile(buffer);
        mindustry.world.blocks.units.MechPad.onMechFactoryDone(tile);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onMechFactoryDone'!", e);
      }
    } else if(id == 27) {
      try {
        mindustry.entities.type.Player player = mindustry.io.TypeIO.readPlayer(buffer);
        mindustry.world.Tile tile = mindustry.io.TypeIO.readTile(buffer);
        mindustry.world.blocks.units.MechPad.onMechFactoryTap(player, tile);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onMechFactoryTap'!", e);
      }
    } else if(id == 29) {
      try {
        long time = buffer.getLong();
        mindustry.core.NetClient.onPingResponse(time);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onPingResponse'!", e);
      }
    } else if(id == 30) {
      try {
        mindustry.entities.type.Player player = mindustry.io.TypeIO.readPlayer(buffer);
        mindustry.entities.type.Player.onPlayerDeath(player);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onPlayerDeath'!", e);
      }
    } else if(id == 31) {
      try {
        int playerid = buffer.getInt();
        mindustry.core.NetClient.onPlayerDisconnect(playerid);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onPlayerDisconnect'!", e);
      }
    } else if(id == 32) {
      try {
        mindustry.entities.type.Player player = mindustry.io.TypeIO.readPlayer(buffer);
        float x = buffer.getFloat();
        float y = buffer.getFloat();
        float rotation = buffer.getFloat();
        boolean left = buffer.get() == 1;
        mindustry.type.Weapon.onPlayerShootWeapon(player, x, y, rotation, left);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onPlayerShootWeapon'!", e);
      }
    } else if(id == 33) {
      try {
        float x = buffer.getFloat();
        float y = buffer.getFloat();
        mindustry.core.NetClient.onPositionSet(x, y);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onPositionSet'!", e);
      }
    } else if(id == 34) {
      try {
        int puddleid = buffer.getInt();
        mindustry.entities.effect.Puddle.onPuddleRemoved(puddleid);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onPuddleRemoved'!", e);
      }
    } else if(id == 35) {
      try {
        int fid = buffer.getInt();
        mindustry.entities.effect.Fire.onRemoveFire(fid);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onRemoveFire'!", e);
      }
    } else if(id == 36) {
      try {
        mindustry.game.Rules rules = mindustry.io.TypeIO.readRules(buffer);
        mindustry.core.NetClient.onSetRules(rules);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onSetRules'!", e);
      }
    } else if(id == 37) {
      try {
        float waveTime = buffer.getFloat();
        int wave = buffer.getInt();
        int enemies = buffer.getInt();
        short coreDataLen = buffer.getShort();
        byte[] coreData = mindustry.io.TypeIO.readBytes(buffer);
        mindustry.core.NetClient.onStateSnapshot(waveTime, wave, enemies, coreDataLen, coreData);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onStateSnapshot'!", e);
      }
    } else if(id == 38) {
      try {
        mindustry.entities.type.Player player = mindustry.io.TypeIO.readPlayer(buffer);
        mindustry.world.Tile tile = mindustry.io.TypeIO.readTile(buffer);
        int value = buffer.getInt();
        mindustry.input.InputHandler.onTileConfig(player, tile, value);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onTileConfig'!", e);
      }
    } else if(id == 39) {
      try {
        mindustry.world.Tile tile = mindustry.io.TypeIO.readTile(buffer);
        float health = buffer.getFloat();
        mindustry.entities.type.TileEntity.onTileDamage(tile, health);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onTileDamage'!", e);
      }
    } else if(id == 40) {
      try {
        mindustry.world.Tile tile = mindustry.io.TypeIO.readTile(buffer);
        mindustry.entities.type.TileEntity.onTileDestroyed(tile);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onTileDestroyed'!", e);
      }
    } else if(id == 41) {
      try {
        mindustry.entities.type.Player player = mindustry.io.TypeIO.readPlayer(buffer);
        mindustry.world.Tile tile = mindustry.io.TypeIO.readTile(buffer);
        mindustry.input.InputHandler.onTileTapped(player, tile);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onTileTapped'!", e);
      }
    } else if(id == 42) {
      try {
        mindustry.entities.type.Player player = mindustry.io.TypeIO.readPlayer(buffer);
        mindustry.net.Administration.TraceInfo info = mindustry.io.TypeIO.readTraceInfo(buffer);
        mindustry.core.NetClient.onTraceInfo(player, info);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onTraceInfo'!", e);
      }
    } else if(id == 43) {
      try {
        mindustry.entities.type.BaseUnit unit = mindustry.io.TypeIO.readBaseUnit(buffer);
        mindustry.entities.type.BaseUnit.onUnitDeath(unit);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onUnitDeath'!", e);
      }
    } else if(id == 44) {
      try {
        mindustry.world.Tile tile = mindustry.io.TypeIO.readTile(buffer);
        int spawns = buffer.getInt();
        mindustry.world.blocks.units.UnitFactory.onUnitFactorySpawn(tile, spawns);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onUnitFactorySpawn'!", e);
      }
    } else if(id == 45) {
      try {
        mindustry.world.Tile tile = mindustry.io.TypeIO.readTile(buffer);
        mindustry.entities.type.Player player = mindustry.io.TypeIO.readPlayer(buffer);
        mindustry.world.blocks.storage.CoreBlock.onUnitRespawn(tile, player);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onUnitRespawn'!", e);
      }
    } else if(id == 46) {
      try {
        mindustry.core.NetClient.onWorldDataBegin();
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'onWorldDataBegin'!", e);
      }
    } else if(id == 47) {
      try {
        int x = buffer.getInt();
        int y = buffer.getInt();
        boolean breaking = buffer.get() == 1;
        mindustry.input.InputHandler.removeQueueBlock(x, y, breaking);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'removeQueueBlock'!", e);
      }
    } else if(id == 48) {
      try {
        mindustry.world.Tile tile = mindustry.io.TypeIO.readTile(buffer);
        mindustry.world.Tile.removeTile(tile);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'removeTile'!", e);
      }
    } else if(id == 49) {
      try {
        mindustry.entities.type.Player player = mindustry.io.TypeIO.readPlayer(buffer);
        mindustry.entities.type.BaseUnit unit = mindustry.io.TypeIO.readBaseUnit(buffer);
        mindustry.ui.fragments.HudFragment.removeUnitEditor(player, unit);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'removeUnitEditor'!", e);
      }
    } else if(id == 50) {
      try {
        mindustry.entities.type.Player player = mindustry.io.TypeIO.readPlayer(buffer);
        mindustry.world.Tile tile = mindustry.io.TypeIO.readTile(buffer);
        mindustry.type.Item item = mindustry.io.TypeIO.readItem(buffer);
        int amount = buffer.getInt();
        mindustry.ui.fragments.BlockInventoryFragment.requestItem(player, tile, item, amount);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'requestItem'!", e);
      }
    } else if(id == 51) {
      try {
        mindustry.entities.type.Player player = mindustry.io.TypeIO.readPlayer(buffer);
        mindustry.world.Tile tile = mindustry.io.TypeIO.readTile(buffer);
        boolean direction = buffer.get() == 1;
        mindustry.input.InputHandler.rotateBlock(player, tile, direction);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'rotateBlock'!", e);
      }
    } else if(id == 53) {
      try {
        java.lang.String message = mindustry.io.TypeIO.readString(buffer);
        mindustry.core.NetClient.sendMessage(message);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'sendMessage'!", e);
      }
    } else if(id == 54) {
      try {
        java.lang.String message = mindustry.io.TypeIO.readString(buffer);
        java.lang.String sender = mindustry.io.TypeIO.readString(buffer);
        mindustry.entities.type.Player playersender = mindustry.io.TypeIO.readPlayer(buffer);
        mindustry.core.NetClient.sendMessage(message, sender, playersender);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'sendMessage'!", e);
      }
    } else if(id == 55) {
      try {
        java.lang.String message = mindustry.io.TypeIO.readString(buffer);
        mindustry.core.NetClient.setHudText(message);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'setHudText'!", e);
      }
    } else if(id == 56) {
      try {
        java.lang.String message = mindustry.io.TypeIO.readString(buffer);
        mindustry.core.NetClient.setHudTextReliable(message);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'setHudTextReliable'!", e);
      }
    } else if(id == 57) {
      try {
        mindustry.entities.type.Player player = mindustry.io.TypeIO.readPlayer(buffer);
        mindustry.world.Tile tile = mindustry.io.TypeIO.readTile(buffer);
        java.lang.String text = mindustry.io.TypeIO.readString(buffer);
        mindustry.world.blocks.logic.MessageBlock.setMessageBlockText(player, tile, text);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'setMessageBlockText'!", e);
      }
    } else if(id == 58) {
      try {
        mindustry.entities.type.Player player = mindustry.io.TypeIO.readPlayer(buffer);
        mindustry.game.Team team = mindustry.io.TypeIO.readTeam(buffer);
        mindustry.ui.fragments.HudFragment.setPlayerTeamEditor(player, team);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'setPlayerTeamEditor'!", e);
      }
    } else if(id == 59) {
      try {
        mindustry.world.Tile tile = mindustry.io.TypeIO.readTile(buffer);
        mindustry.world.Block block = mindustry.io.TypeIO.readBlock(buffer);
        mindustry.game.Team team = mindustry.io.TypeIO.readTeam(buffer);
        int rotation = buffer.getInt();
        mindustry.world.Tile.setTile(tile, block, team, rotation);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'setTile'!", e);
      }
    } else if(id == 60) {
      try {
        mindustry.entities.type.Player player = mindustry.io.TypeIO.readPlayer(buffer);
        mindustry.type.UnitType type = mindustry.io.TypeIO.readUnitType(buffer);
        mindustry.ui.fragments.HudFragment.spawnUnitEditor(player, type);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'spawnUnitEditor'!", e);
      }
    } else if(id == 61) {
      try {
        mindustry.entities.type.Player player = mindustry.io.TypeIO.readPlayer(buffer);
        mindustry.world.Tile tile = mindustry.io.TypeIO.readTile(buffer);
        mindustry.input.InputHandler.transferInventory(player, tile);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'transferInventory'!", e);
      }
    } else if(id == 62) {
      try {
        mindustry.type.Item item = mindustry.io.TypeIO.readItem(buffer);
        float x = buffer.getFloat();
        float y = buffer.getFloat();
        mindustry.entities.type.Unit to = mindustry.io.TypeIO.readUnit(buffer);
        mindustry.entities.effect.ItemTransfer.transferItemEffect(item, x, y, to);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'transferItemEffect'!", e);
      }
    } else if(id == 63) {
      try {
        mindustry.type.Item item = mindustry.io.TypeIO.readItem(buffer);
        int amount = buffer.getInt();
        float x = buffer.getFloat();
        float y = buffer.getFloat();
        mindustry.world.Tile tile = mindustry.io.TypeIO.readTile(buffer);
        mindustry.entities.effect.ItemTransfer.transferItemTo(item, amount, x, y, tile);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'transferItemTo'!", e);
      }
    } else if(id == 64) {
      try {
        mindustry.type.Item item = mindustry.io.TypeIO.readItem(buffer);
        float x = buffer.getFloat();
        float y = buffer.getFloat();
        mindustry.entities.type.Unit to = mindustry.io.TypeIO.readUnit(buffer);
        mindustry.entities.effect.ItemTransfer.transferItemToUnit(item, x, y, to);
      } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Failed to to read remote method 'transferItemToUnit'!", e);
      }
    } else {
      throw new java.lang.RuntimeException("Invalid read method ID: " + id + "");
    }
  }
}
