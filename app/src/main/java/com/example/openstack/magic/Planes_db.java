package com.example.openstack.magic;

import java.util.HashMap;
import java.util.Map;


public class Planes_db {
    public Map<Integer, Map<String, Object>> all_planechases = new HashMap<>();
    private int counter = 0;

    private String title = "";
    private String effect = "";
    private String chaos = "";
    private int image_id;

    public void load_english(){
        all_planechases = new HashMap<>();

        title = "Minamo - Kamigawa";
        effect = "Whenever a player casts a spell, that player may draw 1 card.";
        chaos = "Whenever you roll Chaos, each player may return a BLUE card from his or her graveyard to his or her hand.";
        image_id = R.drawable.plane_minamo;
        insert_data();

        title = "Windriddle Palaces - Belenon";
        effect = "Players play with the top card of their libraries revealed. You may play the top card of any player's library.";
        chaos = "Whenever you roll Chaos, each player puts the top card of his or her library into his or her graveyard.";
        image_id = R.drawable.plane_windriddle;
        insert_data();

        title = "Agyrem - Ravnica";
        effect = "Whenever a white creature dies, return it to the battlefield under its owner's control at the beginning of the next end step. " +
                "Whenever a nonwhite creature dies, return it to its owner's hand at the beginning of the next end step.";
        chaos = "Whenever you roll Chaos, creatures can't attack you until a player planeswalks.";
        image_id = R.drawable.plane_agyrem;
        insert_data();

        title = "Lethe Lake - Arkhos";
        effect = "At the beginning of your upkeep, put the top ten cards of your library into your graveyard.";
        chaos = "Whenever you roll Chaos, target player puts the top ten cards of his or her library into his or her graveyard.";
        image_id = R.drawable.plane_lake;
        insert_data();

        title = "Akoum - Zendikar";
        effect = "Players may cast enchantment spells as though they had flash.";
        chaos = "Whenever you roll Chaos, destroy target creature that isn't enchanted.";
        image_id = R.drawable.plane_akoum;
        insert_data();

        title = "Tazeem - Zendikar";
        effect = "Creatures can't block.";
        chaos = "Whenever you roll Chaos, draw a card for each land you control.";
        image_id = R.drawable.plane_tazeem;
        insert_data();

        title = "Lair of Ashen Idol - Azgol";
        effect = "At the beginning of your upkeep, sacrifice a creature. If you can't, planeswalk.";
        chaos = "Whenever you roll Chaos, any number of target players each create a 2/2 black Zombie creature token.";
        image_id = R.drawable.plane_azgol;
        insert_data();

        title = "Fields of Summer - Moag";
        effect = "Whenever a player casts a spell, that player may gain 2 life.";
        chaos = "Whenever you roll Chaos, you may gain 10 life.";
        image_id = R.drawable.plane_summer;
        insert_data();

        title = "Academy at Tolaria West - Dominaria";
        effect = "At the beginning of your end step, if you have no cards in hand, draw seven cards.";
        chaos = "Whenever you roll Chaos, discard your hand.";
        image_id = R.drawable.plane_tolaria;
        insert_data();

        // 8
        title = "Bloodhill Bastion - Equilor";
        effect = "Whenever a creature enters the battlefield, it gains double strike and haste until end of turn.";
        chaos = "Whenever you roll Chaos, exile target nontoken creature you control, then return it to the battlefield under your control.";
        image_id = R.drawable.plane_bloodhill;
        insert_data();

        title = "Turri Island - Ir";
        effect = "Creature spells cost 2 less to cast.";
        chaos = "Whenever you roll Chaos, reveal the top three cards of your library. Put all creature cards revealed this way into your hand and the rest into your graveyard.";
        image_id = R.drawable.plane_turri;
        insert_data();

        title = "Sea of Sand - Rabiah";
        effect = "Players reveal each card they draw.\n" +
                "Whenever a player draws a land card, that player gains 3 life.\n" +
                "Whenever a player draws a nonland card, that player loses 3 life.";
        chaos = "Whenever you roll Chaos, put target permanent on top of its owner's library.";
        image_id = R.drawable.plane_sand;
        insert_data();

        title = "Quicksilver Sea - Mirrodin";
        effect = "When you planeswalk to Quicksilver Sea or at the beginning of your upkeep, scry 4.";
        chaos = "Whenever you roll Chaos, reveal the top card of your library. You may play it without paying its mana cost.";
        image_id = R.drawable.plane_ice;
        insert_data();

        title = "Prahv - Ravnica";
        effect = "If you cast a spell this turn, you can't attack with creatures.\n" +
                "If you attacked with creatures this turn, you can't cast spells.";
        chaos = "Whenever you roll Chaos, you gain life equal to the number of cards in your hand.";
        image_id = R.drawable.plane_prahv;
        insert_data();

        //13
        title = "Aretopolis - Kephalai";
        effect = "When you planeswalk to Aretopolis or at the beginning of your upkeep, put a scroll counter on Aretopolis, " +
                "then you gain life equal to the number of scroll counters on it.\n" +
                "When Aretopolis has ten or more scroll counters on it, planeswalk.";
        chaos = "Whenever you roll Chaos, put a scroll counter on Aretopolis, then draw cards equal to the number of scroll counters on it.";
        image_id = R.drawable.plane_aretopolis;
        insert_data();

        title = "Astral Arena - Kolbahan";
        effect = "No more than one creature can attack each combat.\n" +
                "No more than one creature can block each combat.";
        chaos = "Whenever you roll Chaos, Astral Arena deals 2 damage to each creature.";
        image_id = R.drawable.plane_astral;
        insert_data();

        title = "Bant - Alara";
        effect = "All creatures have exalted. (Whenever a creature attacks alone, it gets +1/+1 until " +
                "end of turn for each instance of exalted among permanents its controller controls.)";
        chaos = "Whenever you roll Chaos, put a divinity counter on target green, white, or blue creature. " +
                "That creature has indestructible for as long as it has a divinity counter on it.";
        image_id = R.drawable.plane_bant;
        insert_data();

        title = "Celestine Reef - Luvion";
        effect = "Creatures without flying or islandwalk can't attack.";
        chaos = "Whenever you roll Chaos, until a player planeswalks, you can't lose the game and your opponents can't win the game.";
        image_id = R.drawable.plane_luvion;
        insert_data();

        title = "Cliffside Market - Mercadia";
        effect = "When you planeswalk to Cliffside Market or at the beginning of your upkeep, you may exchange life totals with target player.";
        chaos = "Whenever you roll Chaos, exchange control of two target permanents that share a card type.";
        image_id = R.drawable.plane_cliffside;
        insert_data();

        title = "Eloren Wilds - Shandalar";
        effect = "Whenever a player taps a permanent for mana, that player adds one mana to his or her mana pool of any type that permanent produced.";
        chaos = "Whenever you roll Chaos, target player can't cast spells until a player planeswalks.";
        image_id = R.drawable.plane_eloren;
        insert_data();

        title = "Feeding Grounds - Muraganda";
        effect = "Red spells cost 1 less to cast.\n" +
                "Green spells cost 1 less to cast.";
        chaos = "Whenever you roll Chaos, put X +1/+1 counters on target creature, where X is that creature's converted mana cost.";
        image_id = R.drawable.plane_feeding;
        insert_data();

        title = "Goldmeadow - Lorwyn";
        effect = "Whenever a land enters the battlefield, that land's controller creates three 0/1 white Goat creature tokens.";
        chaos = "Whenever you roll Chaos, create a 0/1 white Goat creature token.";
        image_id = R.drawable.plane_goldmeadow;
        insert_data();

        title = "Grand Ossuary - Ravnica";
        effect = "Whenever a creature dies, its controller distributes a number of +1/+1 counters equal to its power among any number of target creatures he or she controls.";
        chaos = "Whenever you roll Chaos, each player exiles all creatures he or she controls and creates X 1/1 green Saproling creature tokens, " +
                "where X is the total power of the creatures he or she exiled this way. Then planeswalk.";
        image_id = R.drawable.plane_ossuary;
        insert_data();

        title = "Grixis - Alara";
        effect = "Blue, black, and/or red creature cards in your graveyard have unearth. The unearth cost is equal to the card's mana cost.";
        chaos = "Whenever you roll Chaos, put target creature card from a graveyard onto the battlefield under your control.";
        image_id = R.drawable.plane_grixis;
        insert_data();

        title = "Grove of the Dreampods - Fabacin";
        effect = "When you planeswalk to Grove of the Dreampods or at the beginning of your upkeep, reveal cards from the top of your library until " +
                 "you reveal a creature card. Put that card onto the battlefield and the rest on the bottom of your library in a random order.";
        chaos = "Whenever you roll Chaos, return target creature card from your graveyard to the battlefield.";
        image_id = R.drawable.plane_grove;
        insert_data();

        title = "Hedron Fields of Agadeem - Zendikar";
        effect = "Creatures with power 7 or greater can't attack or block.";
        chaos = "Whenever you roll Chaos, create a 7/7 colorless Eldrazi creature token with annihilator 1. (Whenever it attacks, defending player sacrifices a permanent.)";
        image_id = R.drawable.plane_agadeem;
        insert_data();

        title = "Immersturm - Valla";
        effect = "Whenever a creature enters the battlefield, that creature's controller may have it deal damage equal to its power to target creature or player of his or her choice.";
        chaos = "Whenever you roll Chaos, exile target creature, then return it to the battlefield under its owner's control.";
        image_id = R.drawable.plane_immersturm;
        insert_data();

        title = "Isle of Vesuva - Dominaria";
        effect = "Whenever a nontoken creature enters the battlefield, its controller creates a token that's a copy of that creature.";
        chaos = "Whenever you roll Chaos, destroy target creature and all other creatures with the same name as that creature.";
        image_id = R.drawable.plane_vesuva;
        insert_data();

        title = "Kessig - Innistrad";
        effect = "Prevent all combat damage that would be dealt by non-Werewolf creatures.";
        chaos = "Whenever you roll Chaos, each creature you control gets +2/+2, gains trample, and becomes a Werewolf in addition to its other types until end of turn.";
        image_id = R.drawable.plane_kessig;
        insert_data();

        title = "Kharasha Foothills - Mongseng";
        effect = "Whenever a creature you control attacks a player, for each other opponent, you may create a " +
                "token that's a copy of that creature, tapped and attacking that opponent. Exile those tokens at the beginning of the next end step.";
        chaos = "Whenever you roll Chaos, you may sacrifice any number of creatures. If you do, Kharasha Foothills deals that much damage to target creature.";
        image_id = R.drawable.plane_kharasha;
        insert_data();

        // 29
        title = "Krosa - Dominaria";
        effect = "All creatures get +2/+2.";
        chaos = "Whenever you roll Chaos, you may add a White, a Blue, a Black, a Red and a Green mana to your mana pool.";
        image_id = R.drawable.plane_krosa;
        insert_data();

        title = "Mirrored Depths - Karsus";
        effect = "Whenever a player casts a spell, that player flips a coin. If he or she loses the flip, counter that spell.";
        chaos = "Whenever you roll Chaos, target player reveals the top card of his or her library. If it's a nonland card, you may cast it without paying its mana cost.";
        image_id = R.drawable.plane_mirrored;
        insert_data();

        title = "Mount Keralia - Regatha";
        effect = "At the beginning of your end step, put a pressure counter on Mount Keralia.\n" +
                "When you planeswalk away from Mount Keralia, it deals damage equal to the number of pressure counters on it to each creature and each planeswalker.";
        chaos = "Whenever you roll Chaos, prevent all damage that planes named Mount Keralia would deal this game to permanents you control.";
        image_id = R.drawable.plane_mount;
        insert_data();

        title = "Murasa - Zendikar";
        effect = "Whenever a nontoken creature enters the battlefield, its controller may search his or " +
                "her library for a basic land card, put it onto the battlefield tapped, then shuffle his or her library.";
        chaos = "Whenever you roll Chaos, target land becomes a 4/4 creature that's still a land.";
        image_id = R.drawable.plane_murasa;
        insert_data();

        title = "Naar Isle - Wildfire";
        effect = "At the beginning of your upkeep, put a flame counter on Naar Isle, then Naar Isle deals damage to you equal to the number of flame counters on it.";
        chaos = "Whenever you roll Chaos, Naar Isle deals 3 damage to target player.";
        image_id = R.drawable.plane_naar;
        insert_data();

        title = "Norn's Dominion - New Phyrexia";
        effect = "When you planeswalk away from Norn's Dominion, destroy each nonland permanent without a fate counter on it, then remove all fate counters from all permanents.";
        chaos = "Whenever you roll Chaos, you may put a fate counter on target permanent.";
        image_id = R.drawable.plane_nor;
        insert_data();

        title = "Orochi Colony - Kamigawa";
        effect = "Whenever a creature you control deals combat damage to a player, you may search your library for a basic land card, put it onto the battlefield tapped, then shuffle your library.";
        chaos = "Whenever you roll Chaos, target creature can't be blocked this turn.";
        image_id = R.drawable.plane_orochi;
        insert_data();

        title = "Orzhova - Ravnica";
        effect = "When you planeswalk away from Orzhova, each player returns all creature cards from his or her graveyard to the battlefield.";
        chaos = "Whenever you roll Chaos, for each opponent, exile up to one target creature card from that player's graveyard.";
        image_id = R.drawable.plane_orzhova;
        insert_data();

        title = "Panopticon - Mirrodin";
        effect = "When you planeswalk to Panopticon, draw a card. At the beginning of your draw step, draw an additional card.";
        chaos = "Whenever you roll Chaos, draw a card.";
        image_id = R.drawable.plane_panopticon;
        insert_data();

        // 38
    }

    public void load_portuguese(){
        all_planechases = new HashMap<>();

        title = "Minamo - Kamigawa";
        effect = "Toda vez que um jogador conjurar uma mágica, ele pode comprar 1 carta.";
        chaos = "Toda vez que você rolar Caos, cada jogador pode retornar uma carta azul do próprio cemitério para a mão.";
        image_id = R.drawable.plane_minamo;
        insert_data();

        title = "Windriddle Palaces - Belenon";
        effect = "Os jogadores jogam com a carta do topo do grimório revelada. Você pode jogar a carta do topo do grimório de qualquer jogador.";
        chaos = "Toda vez que você rolar Caos, cada jogador coloca a carta do topo do grimório em seu próprio cemitério.";
        image_id = R.drawable.plane_windriddle;
        insert_data();

        title = "Agyrem - Ravnica";
        effect = "Toda vez que uma criatura branca morrer, retorne ela para o campo de batalha sob o controle de seu dono no começo da próxima fase final. " +
                "Toda vez que uma criatura que não for branca morrer, retorne ela para a mão de seu dono no começo da próxima fase final.";
        chaos = "Toda vez que você rolar Caos, criaturas não podem atacar você até um jogador Transplanar.";
        image_id = R.drawable.plane_agyrem;
        insert_data();

        title = "Lethe Lake - Arkhos";
        effect = "No começo da sua manutenção, coloque dez cartas do topo do seu grimório no seu cemitério.";
        chaos = "Toda vez que você rolar Caos, o oponente alvo coloca dez cartas do topo do grimório em seu próprio cemitério.";
        image_id = R.drawable.plane_lake;
        insert_data();

        title = "Akoum - Zendikar";
        effect = "Jogadores podem conjurar mágicas de encantamento como se elas tivessem lampejo.";
        chaos = "Toda vez que você rolar Caos, destrua a criatura alvo que não esteja encantada.";
        image_id = R.drawable.plane_akoum;
        insert_data();

        title = "Tazeem - Zendikar";
        effect = "Criaturas não podem bloquear.";
        chaos = "Toda vez que você rolar Caos, compre uma carta por cada terreno que você controla.";
        image_id = R.drawable.plane_tazeem;
        insert_data();

        title = "Lair of Ashen Idol - Azgol";
        effect = "No começo da sua manutenção, sacrifique uma criatura. Se você não puder, transplane.";
        chaos = "Toda vez que você rolar Caos, qualquer número de jogadores alvo criam uma ficha de criatura 2/2 do tipo Zombie.";
        image_id = R.drawable.plane_azgol;
        insert_data();

        title = "Fields of Summer - Moag";
        effect = "Toda vez que um jogador conjurar uma mágica, aquele jogador pode ganhar 2 pontos de vida.";
        chaos = "Toda vez que você rolar Caos, você pode ganhar 10 pontos de vida.";
        image_id = R.drawable.plane_summer;
        insert_data();

        title = "Academy at Tolaria West - Dominaria";
        effect = "No começo da sua fase final, se você não tiver cartas em sua mão, compre 7 cartas.";
        chaos = "Toda vez que você rolar Caos, descarte sua mão.";
        image_id = R.drawable.plane_tolaria;
        insert_data();

        // 8
        title = "Bloodhill Bastion - Equilor";
        effect = "Toda vez que uma criatura entra no campo de batalha, ela ganha golpe duplo e ímpeto até o final do turno.";
        chaos = "Toda vez que você rolar Caos, exile uma criatura alvo que você controla, então retorne ela ao campo de batalha sob seu controle.";
        image_id = R.drawable.plane_bloodhill;
        insert_data();

        title = "Turri Island - Ir";
        effect = "Mágicas de criatura custam 2 a menos para serem conjuradas.";
        chaos = "Toda vez que você rolar Caos, revele as três cartas do topo do seu grimório. Coloque todas as cartas de criaturas reveladas na sua mão e o resto no seu cemitério.";
        image_id = R.drawable.plane_turri;
        insert_data();

        title = "Sea of Sand - Rabiah";
        effect = "Jogadores revelam cada carta que for comprada.\n" +
                "Toda vez que um jogador comprar uma carta de terreno, ele ganha 3 pontos de vida.\n" +
                "Toda vez que um jogador comprar uma carta que não for terreno, ele perde 3 pontos de vida.";
        chaos = "Toda vez que você rolar Caos, coloque uma permanente alvo no topo do grimório do seu dono.";
        image_id = R.drawable.plane_sand;
        insert_data();

        title = "Quicksilver Sea - Mirrodin";
        effect = "Quando você transplanar para Quicksilver Sea ou no começo da sua fase de manutenção, use vidência 4.";
        chaos = "Toda vez que você rolar Caos, revele a carta do topo do seu grimório. Você pode jogar ela sem pagar seu custo de mana.";
        image_id = R.drawable.plane_ice;
        insert_data();

        title = "Prahv - Ravnica";
        effect = "Se você conjurou uma mágica neste turno, você não pode atacar com criaturas.\n" +
                "Se você atacou com criaturas neste turno, você não pode conjurar mágicas.";
        chaos = "Toda vez que você rolar Caos, você ganha pontos de vida igual ao número de cartas em sua mão.";
        image_id = R.drawable.plane_prahv;
        insert_data();

        //13
        title = "Aretopolis - Kephalai";
        effect = "Quando você transplana para Aretopolis ou no começo da sua manutenção, coloque um contador em Aretopolis, " +
                "então você ganha vida igual ao número de contadores em Aretopolis. Quando Aretopolis tiver 10 ou mais contadores, transplane.";
        chaos = "Toda vez que você rolar Caos, coloque um contador em Aretopolis, então compre um número de cartas igual ao número de contadores em Aretopolis.";
        image_id = R.drawable.plane_aretopolis;
        insert_data();

        title = "Astral Arena - Kolbahan";
        effect = "Apenas uma criatura pode atacar a cada combate.\n" +
                 "Apenas uma criatura pode defender a cada combate.";
        chaos = "Toda vez que você rolar Caos, Astral Arena causa 2 danos a cada criatura.";
        image_id = R.drawable.plane_astral;
        insert_data();

        title = "Bant - Alara";
        effect = "Todas as criaturas tem exaltar (Toda vez que uma criatura atacar sozinha, ela ganha +1/+1 até o final do turno).";
        chaos = "Toda vez que você rolar Caos, coloque um marcador divino na criatura alvo que seja verde, branca ou azul. " +
                "Criaturas têm indestrutível enquanto tiver um contador divino.";
        image_id = R.drawable.plane_bant;
        insert_data();

        title = "Celestine Reef - Luvion";
        effect = "Criaturas sem voar ou travessia de ilha não podem atacar.";
        chaos = "Toda vez que você rolar Caos, até um jogador transplanar, você não poderá perder o jogo e seus oponentes não poderão ganhar o jogo.";
        image_id = R.drawable.plane_luvion;
        insert_data();

        title = "Cliffside Market - Mercadia";
        effect = "Quando você transplanar para Cliffside Market ou no começo da sua fase de manutenção, você pode trocar o seu total de pontos de vida com o jogador alvo.";
        chaos = "Toda vez que você rolar Caos, troque o controle de duas permanentes alvo que compartilham um mesmo tipo.";
        image_id = R.drawable.plane_cliffside;
        insert_data();

        title = "Eloren Wilds - Shandalar";
        effect = "Toda vez que um jogador virar uma permamente para gerar mana, aquele jogador pode adicionar 1 mana à sua " +
                "reserva de mana de qualquer tipo que aquela permanente produziria.";
        chaos = "Toda vez que você rolar Caos, o jogador alvo não pode conjurar mágicas até que um jogador transplane.";
        image_id = R.drawable.plane_eloren;
        insert_data();

        title = "Feeding Grounds - Muraganda";
        effect = "Mágicas vermelhas custam 1 a menos para serem conjuradas.\n" +
                 "Mágicas verdes custam 1 a menos para serem conjuradas.";
        chaos = "Toda vez que você rolar Caos, coloque X contadores +1/+1 na criatura alvo, onde X é o custo de mana convertido daquela criatura.";
        image_id = R.drawable.plane_feeding;
        insert_data();

        title = "Goldmeadow - Lorwyn";
        effect = "Toda vez que um terreno entrar no campo de batalha, o controlador daquele terreno cria 3 tokens brancos 0/1 do tipo cabra.";
        chaos = "Toda vez que você rolar Caos, crie 1 token branco 0/1 do tipo cabra.";
        image_id = R.drawable.plane_goldmeadow;
        insert_data();

        title = "Grand Ossuary - Ravnica";
        effect = "Toda vez que uma criatura morrer, seu controlador distribui um número de contadores +1/+1 iguais ao poder dessa criatura.";
        chaos = "Toda vez que você rolar Caos, cada jogador exila todas as criaturas que ele controla e cria X tokens verdes 1/1 do tipo Saproling, onde " +
                "X é o total de poder de suas criaturas. Então transplane.";
        image_id = R.drawable.plane_ossuary;
        insert_data();

        title = "Grixis - Alara";
        effect = "Criaturas azuis, pretas e/ou vermelhas em seu cemitério tem desenterrar. O custo de desenterrar é igual ao custo de mana convertido da carta.";
        chaos = "Toda vez que você rolar Caos, coloque a criatura alvo de um cemitério no campo de batalha sob seu controle.";
        image_id = R.drawable.plane_grixis;
        insert_data();

        title = "Grove of the Dreampods - Fabacin";
        effect = "Quando você transplanar para Grove of the Dreampods ou no começo da sua fase de manutenção, revele as cartas do topo do seu grimório até revelar uma carta de " +
                "criatura. Coloque aquela carta no campo de batalha e o resto no fundo do seu grimório.";
        chaos = "Toda vez que você rolar Caos, retorne a criatura alvo de seu cemitério ao campo de batalha.";
        image_id = R.drawable.plane_grove;
        insert_data();

        title = "Hedron Fields of Agadeem - Zendikar";
        effect = "Criaturas com poder 7 ou maior não podem atacar ou bloquear.";
        chaos = "Toda vez que você rolar Caos, crie um token incolor 7/7 do tipo Eldrazi com aniquilador 1.";
        image_id = R.drawable.plane_agadeem;
        insert_data();

        title = "Immersturm - Valla";
        effect = "Toda vez que uma criatura entrar no campo de batalha, o controlador pode dar um dano igual ao seu poder à uma criatura ou jogador alvo.";
        chaos = "Toda vez que você rolar Caos, exile uma criatura alvo, então retorne ela ao campo de batalha sob o controle de seu dono.";
        image_id = R.drawable.plane_immersturm;
        insert_data();

        title = "Isle of Vesuva - Dominaria";
        effect = "Toda vez que um criatura não token entra no campo de batalha, seu controlador cria um token que é uma cópia daquela criatura.";
        chaos = "Toda vez que você rolar Caos, destrua a criatura alvo e todas as outras criaturas como o mesmo nome.";
        image_id = R.drawable.plane_vesuva;
        insert_data();

        title = "Kessig - Innistrad";
        effect = "Previna todo dano de combate que seria dado por criaturas que não sejam do tipo Lobisomem.";
        chaos = "Toda vez que você rolar Caos, cada criatura que você controla ganha +2/+2, atropelar, " +
                "e se torna Lobisomem em adição ao seus outros tipos até o final do turno";
        image_id = R.drawable.plane_kessig;
        insert_data();

        title = "Kharasha Foothills - Mongseng";
        effect = "Toda vez que uma criatura que você controla atacar um jogador, crie um token daquela criatura " +
                "atacando cada outro oponente. Exile os token no final do seu turno.";
        chaos = "Toda vez que você rolar Caos, você pode sacrificar qualquer número de criaturas. Se fizer, Kharasha causará aquela quantidade de dano na criatura alvo.";
        image_id = R.drawable.plane_kharasha;
        insert_data();

        // 29
        title = "Krosa - Dominaria";
        effect = "Todas as criaturas ganham +2/+2.";
        chaos = "Toda vez que você rolar Caos, você pode adicionar uma mana branca, uma vermelha, uma azul, uma preta e uma verde à sua reserva de mana.";
        image_id = R.drawable.plane_krosa;
        insert_data();

        title = "Mirrored Depths - Karsus";
        effect = "Toda vez que um jogador conjurar uma mágica, ele deve lançar uma moeda e escolher cara ou coroa. Caso ele erre o lançamento, anule aquela mágica.";
        chaos = "Toda vez que você rolar Caos, o jogador alvo revela a carta do topo do grimório. " +
                "Se não for uma carta de terreno, você pode conjurar aquela carta sem pagar seu custo de mana.";
        image_id = R.drawable.plane_mirrored;
        insert_data();

        title = "Mount Keralia - Regatha";
        effect = "No começo da sua fase final, coloque um contador de pressão em Mount Keralia. \n" +
                 "Quando você transplanar de Mount Keralia, ela causará dano igual ao número de contadores em cada criatura e planeswalker.";
        chaos = "Toda vez que você rolar Caos, previna todo dano que o plano Mount Keralia causaria nas permanentes que você controla.";
        image_id = R.drawable.plane_mount;
        insert_data();

        title = "Murasa - Zendikar";
        effect = "Toda vez que um criatura não token entrar no campo de batalha, seu controlador pode procurar no grimório por um card de terreno básico e " +
                "colocá-lo no campo de batalha virado. E depois embaralhar seu grimório.";
        chaos = "Toda vez que você rolar Caos, o terreno alvo se torna uma criatura 4/4, ela ainda conta como um terreno.";
        image_id = R.drawable.plane_murasa;
        insert_data();

        title = "Naar Isle - Wildfire";
        effect = "No começo da sua fase de manutenção, coloque um contador de chamas em Naar Isle, então Naar Isle causa dano a você igual ao número de contadores.";
        chaos = "Toda vez que você rolar Caos, Naar Isle causa 3 pontos de dano ao jogador alvo.";
        image_id = R.drawable.plane_naar;
        insert_data();

        title = "Norn's Dominion - New Phyrexia";
        effect = "Quando você transplanar de Norn's Dominion, destrua cada permanente que não seja um terreno sem contador de fé.";
        chaos = "Toda vez que você rolar Caos, você pode colocar um contador de fé na permanente alvo.";
        image_id = R.drawable.plane_nor;
        insert_data();

        title = "Orochi Colony - Kamigawa";
        effect = "Toda vez que um criatura que você controla causa dano de combate a um jogador, você pode colocar um " +
                "terreno básico do seu grimório no campo de batalha virado. Então embaralhe seu grimório.";
        chaos = "Toda vez que você rolar Caos, a criatura alvo não poderá ser bloqueada neste turno.";
        image_id = R.drawable.plane_orochi;
        insert_data();

        title = "Orzhova - Ravnica";
        effect = "Quando você transplanar de Orzhova, cada jogador retorna todas as cartas de criatura do seu cemitério para o campo de batalha.";
        chaos = "Toda vez que você rolar Caos, para cada oponente, exile uma criatura alvo do cemitério.";
        image_id = R.drawable.plane_orzhova;
        insert_data();

        title = "Panopticon - Mirrodin";
        effect = "Quando você transplanar para Panopticon, compre uma carta. No começo da sua fase de compra, compre uma carta adicional.";
        chaos = "Toda vez que você rolar Caos, compre uma carta.";
        image_id = R.drawable.plane_panopticon;
        insert_data();
    }

    private void insert_data(){
        Map<String, Object> dict_insert = new HashMap<>();

        dict_insert.put("title", title);
        dict_insert.put("effect", effect);
        dict_insert.put("chaos", chaos);
        dict_insert.put("image", image_id);

        all_planechases.put(counter, dict_insert);
        counter = counter + 1;
    }
}
