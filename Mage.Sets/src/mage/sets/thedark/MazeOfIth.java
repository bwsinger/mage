/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets.thedark;

import java.util.UUID;

import mage.constants.CardType;
import mage.constants.Rarity;
import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.effects.common.PreventDamageByTargetEffect;
import mage.abilities.effects.common.PreventDamageToTargetEffect;
import mage.abilities.effects.common.UntapTargetEffect;
import mage.cards.CardImpl;
import mage.constants.Duration;
import mage.constants.Zone;
import mage.target.common.TargetAttackingCreature;

/**
 *
 * @author Plopman
 */
public class MazeOfIth extends CardImpl<MazeOfIth> {

    public MazeOfIth(UUID ownerId) {
        super(ownerId, 114, "Maze of Ith", Rarity.UNCOMMON, new CardType[]{CardType.LAND}, "");
        this.expansionSetCode = "DRK";

        // {tap}: Untap target attacking creature. Prevent all combat damage that would be dealt to and dealt by that creature this turn.
        Ability ability = new SimpleActivatedAbility(Zone.BATTLEFIELD, new UntapTargetEffect(), new TapSourceCost());
        ability.addEffect(new PreventDamageByTargetEffect(Duration.EndOfTurn, true));
        ability.addEffect(new PreventDamageToTargetEffect(Duration.EndOfTurn, Integer.MAX_VALUE, true));
        ability.addTarget(new TargetAttackingCreature());
        this.addAbility(ability);
    }

    public MazeOfIth(final MazeOfIth card) {
        super(card);
    }

    @Override
    public MazeOfIth copy() {
        return new MazeOfIth(this);
    }
}
